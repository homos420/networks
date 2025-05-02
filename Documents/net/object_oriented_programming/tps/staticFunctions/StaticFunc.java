package staticFunctions;

import java.util.Random;

public class StaticFunc {
    public static int randomInt() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public static void fillsArray(int array[]) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(100);
    }

    public static void display(int array[]) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + ",");

    }

    public static int minT(int array[]) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maxT(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int sumT(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }
// second part 
public static void fills2dArray(int array[][]){
    for(int i=0; i<array.length;i++){
        fillsArray(array[i]);
    }
}
public static void display2(int array[][]){
    for (int i=0;i<array.length;i++){
        display(array[i]);
    }
}
    public static void main(String[] args) {
        int array[] = new int[10];
        int array2d[][] = new int[10][10];
        System.out.println(randomInt());
        fillsArray(array);
      //  display(array);
        fills2dArray(array2d);
        display2(array2d);
        System.out.println(minT(array));
    }
}
