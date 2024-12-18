package _10Recursion;

public class preInpost {
    public static void pip(int n){  // TC = O(2^n)
        if (n == 0) return;
        System.out.println("pre "+n);  // pre
        pip(n-1);
        System.out.println("in "+n);  // in
        pip(n-1);
        System.out.println("post"+n);  // post
    }
    public static void main(String[] args) {
        /*
            fun(){
                base case
                work
                fun()
                work
                fun()
                work
            }
         */
//      function call stack makes it easy for us to find how recursion works
//        pip(1) 3  3 is line number
//        pip(2) 3
//        main()
        pip(3);

        /*
        recursion
        pip(3) = 3->pip(2)->3->pip(2)->3
        pip(2) = 2->pip(1)->2->pip(1)->2
        pip(1) = 1->pip(0)->1->pip(0)->1
         */
    }
}
