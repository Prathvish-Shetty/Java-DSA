package _8Sorting;

public class Question {
    public static void print(int[] arr){
        for (int e : arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,1,7,3,8,9,2};
//      o/p          3 0 4 2 5 6 1
        int n = arr.length;
        int x = 0;
//        for (int j = 0; j < n; j++) {
//            int minIndex = 0;
//            for (int i = 0; i < n; i++) {
//                if (arr[i] >= x && arr[i]<arr[minIndex]) minIndex = i;
//            }
//            arr[minIndex] = x;
//            x++;
//            print(arr);
//            System.out.println(x);
//            System.out.println(minIndex);
//            System.out.println(arr[minIndex]);
//        }
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = 0; j < n; j++) {
                if (arr[j]<min && arr[j]>0){
                    min = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = x;
            x--;
        }
        for (int e : arr)   e*=-1;  // elements in for each loop cannot be modified
        for (int i = 0; i < n; i++) {
            arr[i]*=-1;
        }
        print(arr);
    }
}
