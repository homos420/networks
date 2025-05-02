package arraysOrArryalist;
import java.util.ArrayList;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        ArrayList<Integer> fibo = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = scanner.nextInt(); 
        scanner.close();
        fibo.add(0);
        fibo.add(1);
        // filling the list 
        for (int i = 2; i < n; i++) {
            fibo.add(fibo.get(i - 1) + fibo.get(i - 2));
        }
        // printing the list 
        for (int i = 0; i < fibo.size(); i++) {
            System.out.print(fibo.get(i) + ",");
        }
    }
}
