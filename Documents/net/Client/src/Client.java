
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;

        InputStreamReader InputStreamReader = null;
        OutputStreamWriter OutputStreamWriter = null;

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            socket = new Socket("localhost", 1234);
            InputStreamReader = new InputStreamReader(socket.getInputStream());
            OutputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
            bufferedReader = new BufferedReader(InputStreamReader);
            bufferedWriter = new BufferedWriter(OutputStreamWriter);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String msgToSend = scanner.nextLine();
                bufferedWriter.write(msgToSend);
                bufferedWriter.newLine();
                bufferedWriter.flush(); // if buffer full it will flush the stream;
                System.out.println("server: " + bufferedReader.readLine());
                if (msgToSend.equalsIgnoreCase("done")) // ignore the case and quit
                {
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (socket != null) {
                    socket.close();
                }
                if (InputStreamReader != null) {
                    InputStreamReader.close();
                }
                if (OutputStreamWriter != null) {
                    OutputStreamWriter.close();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}