package _1.Basics;
import java.util.Scanner;
public class areaOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // write only once
        /*

        System.out.print("Enter the radius of circle: ");
        double r = scan.nextDouble();
//        double r = 10;
        double area = 3.141592 * r * r;
        System.out.println("Area of circle with radius "+r+" is "+area);
         */
//        int a = scan.nextInt();
//        System.out.println(3%5);    // smaller number will be printed
        /*
            a % b = a   (a<b)
            a % -b = a % b
            - (a % b) = - (a % b)
            - (a % -b) = - (a % b)
        */
//        int n = scan.nextInt();
//        double x = (double) n;  // typecasting
//        int y = (int) x;
//        System.out.println(x/2+" "+y);

//      level of hierarchy BO>D=M>A=S
//      for same precedence operations are done from left to right
        /*
        int/int = int
        int/double = double
        double/int = double
        */
//        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character to get its ASCII value: ");
        char ch = scan.next().charAt(0);
        int ascii = (int)ch;
        System.out.println("ASCII value of "+ch+" is "+ascii);
    }
}

