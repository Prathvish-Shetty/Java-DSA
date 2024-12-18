package _13Stack;

import java.util.Arrays;
import java.util.Stack;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int[] arr = {10,9,8,5,6,7,4,3,100};
        int n = arr.length;
        System.out.println(Arrays.toString(prevGreater(arr, n)));
    }

    public static int[] prevGreater(int[] arr,int n) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        ans[0] = -1;
        st.push(arr[0]);
        for (int i = 1; i < n; i++) {
            while(!st.isEmpty() && st.peek()<arr[i]){
                st.pop();
            }
            ans[i] = st.isEmpty()?-1:st.peek();
            st.push(arr[i]);
        }
        return ans;
    }
}

// auxillary space is the space used to solve the problem
// input s[ace is the space used to store the input
// never do anything to the input
// 1s = 10^8 operations
// 2s = 2*10^8 so on

