/**
 *Write a Java program using arrays and methods that asks the user to enter 5 integer values
 * , stores them in an array, and then creates and calls separate methods to calculate and print
 * the maximum, minimum, sum, and average of these numbers.
 */
package edu.zuj.vp.week4.lacture1;

import java.util.Scanner;

public class array_HW {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("entar a index " + i);
       // storg valed in index
            arr[i] = in.nextInt();

        }
//        full  valed in arr
        for (int i = 0; i < arr.length; i++) {
            System.out.println("the intex " + i + " = " + arr[i]);
        }

        System.out.println(" \n tha max = " + maxx(arr));
        System.out.println("\n tha min = " + minn(arr));
        System.out.println("\n tha sum = " + summ(arr));
        System.out.println("\n tha avg = " + avgg(arr));
    }

//    max mathod 
    public static int maxx(int arr[]) {

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }

        return max;
    }

//    min mathod
    public static int minn(int arr[]) {

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;

    }

//    sum mathod
    public static double summ(int arr[]) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
//    avg mathod 

    public static double avgg(int arr[]) {
        double sum = summ(arr);
        double avg = sum / arr.length;
        return avg;
    }

}
