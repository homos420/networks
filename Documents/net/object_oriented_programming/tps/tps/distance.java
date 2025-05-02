package tps;

import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the x coordinate of point P: ");
        double x1 = scanner.nextDouble();
        
        System.out.print("Enter the y coordinate of point P: ");
        double y1 = scanner.nextDouble();
        
        System.out.print("Enter the x coordinate of point W: ");
        double x2 = scanner.nextDouble();
        
        System.out.print("Enter the y  coordinate of point W: ");
        double y2 = scanner.nextDouble();
        
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        System.out.println("The distance between points P and W is: " + distance);
        
        scanner.close();
    }
}