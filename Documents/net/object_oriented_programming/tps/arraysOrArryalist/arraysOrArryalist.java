package arraysOrArryalist;

//import java.util.Scanner;
//import java.util.ArrayList;

// exercie 7
import java.util.Random;

public class arraysOrArryalist {
    public static void main(String[] args) {
        int n = 5;
        Integer[][] PointsT = new Integer[n][2];
        Random random = new Random();
        // filling
        for (int i = 0; i < n; i++) {
            PointsT[i][0] = random.nextInt(100);
            PointsT[i][1] = random.nextInt(100);

        }
        // printing
        System.out.println("your random table is:");
        for (int i = 0; i < n; i++) {
            System.out.println("Point " + (i + 1) + ": (" + PointsT[i][0] + ", " + PointsT[i][1] + ")");
        }
        // p(x,y)
        int px = random.nextInt(100);
        int py = random.nextInt(100);
        System.out.println("point p" + px + "," + py);
        // calculate the distance
        double minDistance = Double.MAX_VALUE;
        int what_point=0;
        for (int i = 0; i < n; i++) {
            double distance = Math.sqrt(Math.pow(PointsT[i][0] - px, 2) + Math.pow(PointsT[i][1] - py, 2));
            System.out.println("Distance from p to Point " + (i + 1) + ": " + distance);
            if (distance < minDistance) {
                minDistance = distance;
                what_point= i+1;
            }
        }
        // minimum distance 
        System.out.println("the minimal distance from p to any point is "+minDistance +"it belongs to the point  "+ what_point);
    }

}