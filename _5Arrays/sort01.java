package _5Arrays;

public class sort01 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,0,0,1};
        int n = arr.length;
        int noOfZeros = 0,noOfOnes = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] == 0) noOfZeros++;
            else noOfOnes++;
        }
//        int i = 0;
//        while(i<noOfZeros){
//            arr[i++] = 0;
//        }
//        while(i<n){
//            arr[i++] = 1;
//        }
//        we can use 2 for loop from 0 to noOfZeros and noOfZeros to n
        /*
//        Two pass solution
        for (int j = 0; j < n; j++) {
            if (j<noOfZeros) arr[j] = 0;
            else arr[j] = 1;
        }
*/
//        one pass solution using two pointer approach we can also use if else if else
        int s = 0,e = n-1;
        while (s < e){{
            if(arr[s] == 0) s++;
            if (arr[e] == 1) e--;
//            if (s>e) break;
            if (s<e && arr[s] == 1 && arr[e] == 0) swap(arr,s,e); //instead of swapping we can assign arr[s]=0,arr[e]=1
            s++;e--;
        }

        }
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i,int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
