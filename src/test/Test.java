package test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //print add num 
        System.out.println("the add num = ");
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + "-");
        }

//        --------proplem solving -----------
        System.out.print("\n" + "he add num = ");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "-");
            }
        }

//        use else if 
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num >= 50) {
            System.out.println("wow");
        } else if (num > 40 && num < 50) {
            System.out.println("perfact");
        } else {
            System.out.println("good");
        }

//        swich 
        char sioan = 'A';
        switch (sioan) {

            case 'A':
                System.out.println("sunday");
                break;
            case 'B':
                System.out.println("monday");
                break;
            case 'C':
                System.out.println("tuosday");
                break;
            default:
                System.out.println("weekind");

        }
        String name="hanaa";
        switch (name){
            case "HANAA":
                System.out.println("wael");
            break;
            case "NASER":
                System.out.println("acmael");
                break;
        default:
            System.out.println("mama & dade");
        
        }
                

    }

}
