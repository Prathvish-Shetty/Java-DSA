package _3.Loops;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
/*
//      Print AP upto 'n' terms starting from 1 $[ an = a +(n-1)d ] 1,3,5,7,9,...
        for (int i = 1 ; i <= 2*n-1 ; i+=2) {
            System.out.print(" "+i+" ");
        }
       System.out.println("\n");
*/
/*
        for (int i = 1,nt = 1 ; i <= n ; i++,nt+=2){
            System.out.print(" "+nt+" ");
        }
        int a = 5, d = 3;
        for (int i = 1 ; i <= n ; i++){
            System.out.println(a);
            a += d;
        }
*/
/*
        int a = 5;
        for (int i = 1 ; i <= n ; i++){
            System.out.println(a);
            a *= 2;
        }
*/
/*
        if(n<2) System.out.println("Invalid Number");
        else {
            boolean isPrime = true;
            for (int i = 2; i*i <= n; i++) {
                if(n%i == 0){
                    System.out.println("Composite");
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) System.out.println("Prime");
        }
        for (int i = 0; i <= n; i++) {
            if(i%2 == 0)    continue;
            System.out.println(i);
        }
*/
//        int i;
//        while (i=10){
//            System.out.println(i);
//            i++;
//        }$important edge case
//        while ('a' < 'b') System.out.println("Hi");   infinite loop
        int count = 0, sum = 0;
        while (n!=0){
            count++;
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Number of digits : "+count+"\n"+"Sum of digits : "+sum);
    }
}
