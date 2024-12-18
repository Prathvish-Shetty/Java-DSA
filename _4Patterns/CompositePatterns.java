package _4Patterns;

import java.util.Scanner;

public class CompositePatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns : ");
        int n = sc.nextInt();

/*

//        Star Triangle Horizontally flipped
//        a
//        a b
//        a b c
//        a b c d
//        a b c d e
//        Breaking the pattern into parts
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i ; j++) { // space
                System.out.print("  ");
            }
            for (int k = 1; k <= i ; k++) { // star
//                System.out.print("* ");
//                System.out.print(k+" ");
                System.out.print((char)('a' + k -1) + " ");
            }
            System.out.println();
        }

//        Rhombus
//                * * * * *
//              * * * * *
//            * * * * *
//          * * * * *
//        * * * * *
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i ; j++) { // space
                System.out.print("  ");
            }
            for (int k = 1; k <= n ; k++) { // star
                System.out.print("* ");
//                System.out.print(k+" ");
//                System.out.print((char)('a' + k -1) + " ");
            }
            System.out.println();
        }



//        Star Pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i ; j++) { // space
                System.out.print("  ");
            }
            for (int k = 1; k <= i ; k++) { // star
                System.out.print("* ");
            }
            for (int l = 1; l < i ; l++) { // star
                System.out.print("* ");
            }
            System.out.println();
        }

//      Most efficient
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i ; j++) { // space
                System.out.print("  ");
            }
            for (int k = 1; k <= 2*i-1 ; k++) { // star
                System.out.print("* ");
            }
            System.out.println();
        }

//      : noOfSpaces = n-1  ->  noOfSpaces--
//      : noOfStars = 1 ->  noOfStars += 2
        int nsp = n-1 ;
        int nst = 1 ;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp ; j++) { // space
                System.out.print("  ");
            }
            for (int k = 1; k <= nst ; k++) { // star
                System.out.print("* ");
            }
            System.out.println();
            nsp--;
            nst += 2;
        }

//        Number Pyramid Palindrome
//        instead of using 3 variables inside first loop we can just re-initialize the first variable
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+" ");
            }
            for (int k = i-1; k >=1 ; k--) {
                System.out.print(k+" ");
            }
//            for (int k = 1 ; k < i ; k++) {
//                System.out.print(i - k + " ");
//            } my alternative
            System.out.println();
        }
        System.out.println();



//      Star Bridge
//        my solution
        for (int i = 1; i <= 2*n-1 ; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i < n ; i++) {
            for (int j = 1; j < n-i+1 ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < 2*i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < n-i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        for (int i = 1; i <= 2*n-1 ; i++) {
            System.out.print("* ");
        }
        System.out.println();
        n-=1;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i+1 ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n-i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        /* alternate
        int nsp = 1;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i+1 ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= nsp ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n-i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            nsp += 2;
        }
        System.out.println();
        */
/*
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < n ; j++) {
                if (i+j <= n)System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.print("  ");
            for (int j = 0; j < n ; j++) {
                if (i+j <= n)System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();



//        Number Bridge
        for (int i = 1; i <= 2*n-1 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        n--;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i+1 ; j++) {
                System.out.print(j+" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n-i+1 ; j++) {
                System.out.print(j+n+1+" ");
            }
            System.out.println();
        }
        System.out.println();

//        IMP
        for (int i = 1; i <= 2*n-1 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        n--;
        for (int i = 1; i <= n ; i++) {
            int a = 1;
            for (int j = 1; j <= n-i+1 ; j++) {
                System.out.print(a++ + " ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("  ");
                a++;
            }
            for (int j = 1; j <= n-i+1 ; j++) {
                System.out.print(a++ +" ");
            }
            System.out.println();
        }
        System.out.println();


//        Star Diamond
        int nsp = n-1;
        int nst = 1;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= nsp ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst ; j++) {
                System.out.print("* ");
            }
            nsp--;
            nst = nst +2;
            System.out.println();
        }
        nsp = 1;
        nst = n + 1;
//        nst = nst - 4;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= nsp ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst ; j++) {
                System.out.print("* ");
            }
            nsp++;
            nst -= 2;
            System.out.println();
        }
        System.out.println();



//        Number Spiral
//        imp
       for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
//                System.out.print((i>=j) ? j + " " : i + " " );
                System.out.print(Math.min(i,j) + " " );
            }
            System.out.println();
        }
 */
//      a + i = 2n  ;   b + j = 2n  a & b are pseudo numbers
        for (int i = 1; i <= 2*n-1 ; i++) {
            for (int j = 1; j <= 2*n-1 ; j++) {
                int a = i , b = j ;
                if (i > n)  a = 2*n - i;
                if (j > n)  b = 2*n - j;
                System.out.print(Math.min(a,b) + " " );
            }
            System.out.println();
        }
        System.out.println();

//        Reverse Number spiral
//        k + min(a,b) = n + 1
//        k = n + 1 - min(a + b)
        for (int i = 1; i <= 2*n-1 ; i++) {
            for (int j = 1; j <= 2*n-1 ; j++) {
                int a = i , b = j ;
                if (i > n)  a = 2*n - i;
                if (j > n)  b = 2*n - j;
                System.out.print(n + 1 -Math.min(a,b) + " " );
            }
            System.out.println();
        }







    }

}
