import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;

public class ClientUI {
    private JFrame frame;
    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;
    private BufferedWriter bufferedWriter;
    private BufferedReader bufferedReader;

    public ClientUI() {
        // Set up the UI
        frame = new JFrame("Client Chat");
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        inputField = new JTextField();
        sendButton = new JButton("Send");

        // Layout
        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(chatArea), BorderLayout.CENTER);
        frame.add(inputField, BorderLayout.SOUTH);
        frame.add(sendButton, BorderLayout.EAST);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Connect to the server
        try {
            Socket socket = new Socket("localhost", 1234);
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Start a thread to listen for messages from the server
            new Thread(() -> {
                try {
                    String message;
                    while ((message = bufferedReader.readLine()) != null) {
                        chatArea.append("Server: " + message + "\n");
                    }
                } catch (IOException e) {
                    chatArea.append("Connection closed.\n");
                }
            }).start();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(frame, "Unable to connect to the server.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Send button action
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });

        // Enter key action
        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
    }

    private void sendMessage() {
        String message = inputField.getText();
        if (!message.isEmpty()) {
            try {
                bufferedWriter.write(message);
                bufferedWriter.newLine();
                bufferedWriter.flush();
                chatArea.append("You: " + message + "\n");
                inputField.setText("");

                if (message.equalsIgnoreCase("done")) {
                    bufferedWriter.close();
                    bufferedReader.close();
                    System.exit(0);
                }
            } catch (IOException e) {
                chatArea.append("Error sending message.\n");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ClientUI::new);
    }
}
