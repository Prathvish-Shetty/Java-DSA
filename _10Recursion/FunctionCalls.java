package _10Recursion;

public class FunctionCalls {
    public static void main(String[] args) {
        System.out.println("Inside main");
        apple();
    }

    public static void apple() {
        System.out.println("Inside apple");
        banana();
    }

    private static void banana() {
        System.out.println("Inside Banana");
        mango();
    }
    private static void mango() {
        System.out.println("Inside mango");
    }

}
