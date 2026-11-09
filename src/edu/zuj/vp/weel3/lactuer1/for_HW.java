
package edu.zuj.vp.weel3.lactuer1;

public class for_HW {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= 5; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
        
        System.out.println(" \n ==============================");
            for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
            System.out.println("==========================");
               for (int i = 1; i <= n; i++) {
//                   هون عشان الفراغات لما كان i=1 --> كان عنا n-1 من الفراغات 
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
//هون عشان الستارس لما كان عنا i=1 طبع نجمه وحدة 
// لما كان عنا (i=2)--> (*=3)--(i=3)-->(*=5)  بنلاحظ انو 2 * i - 1=num of stars  
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
//             عشان تترك عنا سطر 
            System.out.println();
        }
    }
    
}

