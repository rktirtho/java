
package day3;

import java.util.Scanner;

public class Day3 {

    public static void main(String[] args) {
           int a, b, c, d;
        a = 50;
        b = 40;
        c = 30;
        d = 88; 

     System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mark :");
        int age = sc.nextInt();


        int number;
        number = sc.nextInt();
        if (number >= 80) {
            System.out.println("A+"); 
        } else if (number >= 79 && number <= 70) {
            System.out.println("A");
        }else if (number >= 69 && number <= 60) {
            System.out.println("A-");
        }else if (number >= 59 && number <= 50) {
            System.out.println("b");
        }else if (number >= 49 && number <= 40) {
            System.out.println("c");
        }else if (number >= 39 && number <= 33) {
            System.out.println("D");
        }else{
            System.out.println("F");
        }
        
       



    }
}