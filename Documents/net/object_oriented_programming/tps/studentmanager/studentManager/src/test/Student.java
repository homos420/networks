package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;
    String fname;
    ArrayList<Integer> Marks = new ArrayList<Integer>();
    void displayMarks(){
        System.out.println(average());
    }
    void display() {

        System.out.println(name + " " + fname + " " + average());

    }

    void removeMark(int i) {
        if (i < Marks.size()) {
            Marks.remove(i);
        } else {
            System.out.println("error");
        }
    }

    double sum() {

        int Sum = 0;
        for (int i = 0; i < Marks.size(); i++) {
            Sum = Sum + Marks.get(i);
        }
        return Sum;

    }

    double average() {
        return sum() / Marks.size();

    }

    public void setName() {
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        in.close();
    }

   public void setName(String s) {
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        in.close();
    }
    void setFname() {
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        in.close();
    }
    void setfname(String s) {
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        in.close();
    }
}
