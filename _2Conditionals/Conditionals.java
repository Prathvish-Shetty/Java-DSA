package _2.Conditionals;

import java.util.Scanner;

public class Conditionals {
    static void EO(int a){
        System.out.println((a%2 == 0) ? "Even" : "Odd");
    }
    static void Leap(int y){
        System.out.println(((y%4 == 0) && (y%100 != 0 ) || y%400 ==0) ? "Leap" : "Not Leap");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*  Even Odd
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n%2 == 0) System.out.println("Even");
        else System.out.println("Odd");
        */
        /*  Profit Loss
        System.out.print("Enter Cost Price : ");
        int cp = sc.nextInt();
        System.out.print("Enter Selling Price : ");
        int sp = sc.nextInt();
        if(sp > cp) System.out.println("Profit "+(sp-cp));
        if(sp < cp) System.out.println("Loss "+(cp-sp));
        if(sp == cp) System.out.println("Nothing");
        */
        /*
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        find largest
        if(a >= b && a >= c) System.out.println(a+" is Greatest");
        else if(b >= a && b >= c) System.out.println(b+" is Greatest");
        else System.out.println(c+" is Greatest");
//        find smallest
        if(a <= b && a <= c) System.out.println(a+" is Smallest");
        else if(b <= a && b <= c) System.out.println(b+" is C");
        else System.out.println(c+" is Smallest");

        if(a > b){
            if(a > c) System.out.println(a+" is Greatest");
            else System.out.println(c+" is Greatest");
        } else {
            if(b > c)   System.out.println(c+" is Greatest");
            else System.out.println(c+" is Greatest");
        }

        if(a < b){
            if(a < c) System.out.println(a+" is Smallest");
            else System.out.println(c+" is Smallest");
        } else {
            if(b < c)   System.out.println(c+" is Smallest");
            else System.out.println(c+" is Smallest");
        }
        */
        /*
//      Ternary operatoe
//      condition ? if true : if false ;
        int n = sc.nextInt();
        System.out.println((n%2 == 0) ? "Even" : "Odd");
        */
        /*
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        char op = scn.next().charAt();
        switch (ch){
            case '+' :
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);
                break;
            case '*' :
                System.out.println(a*b);
                break;
            case '/' :
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid operator");
        }
        */

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
//        System.out.println(Math.abs(a));
        EO(a);
        Leap(a);
    }
}
