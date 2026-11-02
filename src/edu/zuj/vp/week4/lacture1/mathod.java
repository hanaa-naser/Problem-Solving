package edu.zuj.vp.week4.lacture1;

import java.util.Scanner;

public class mathod {

    public static void main(String[] args) {
        int sum1;
        // First sum using the parameterless method

        sum1 = readNam();
        System.out.println("the sum 1 = " + sum1);

        // Second sum using the overloaded method (passed as TWO separate arguments)
        sum1 = readNam("enter n1", "enter n2");
        System.out.println("the sum 2 = " + sum1);
    }

    public static int readNam() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a int n1");
        int n1 = in.nextInt();
        System.out.println("entar a int n2");
        int n2 = in.nextInt();
        return n1 + n2;
    }

    public static int readNam(String msg1, String msg2) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg1);
        int n1 = in.nextInt();
        System.out.println(msg2);
        int n2 = in.nextInt();
        return n1 + n2;
    }
}
