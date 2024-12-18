package _11AdvancedSorting;
public class QuickSelect {
    public static int ans;
    public static void print(int[] arr) {
        for (int e : arr)
            System.out.print(e + " ");
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static int partition(int[] a,int l,int h){
        int p = a[l],pi = l;
        int smcnt = 0;
        for (int i = l+1; i <= h; i++) {
            if (a[i]<=p) smcnt++;
        }
        int newpi = pi+smcnt;
        swap(a,pi,newpi);
        int i = l,j = h;
        while (i<newpi && j>newpi){
            if (a[i]<=p) i++;
            else if (a[j]>p)   j--;
            else if (a[i]>p && a[j]<=p) swap(a,i,j);
        }

//        while (i<pi && j>pi){
//            while(a[i]<p)   i++;
//            while(a[j]>p)   j++;
//            if (a[i]>p && a[j]<=p) swap(a,i,j);
//        }
        return newpi;
    }

    public static void quickSelect(int[] a,int l,int h,int k) {
        if (l>h)   return;
//        if (l == h && (l == k-1)){
//            ans = a[l];
//            return;
//        }
        int p = partition(a,l,h);
        if (p == k-1){
            ans = a[p];
            return;
        }
        if (k-1<p) quickSelect(a,l,p-1,k);
        else quickSelect(a,p+1,h,k);

    }
    public static void main(String[] args) {
//        kth largest = (n-k+1)th smallest
//        int[] arr = {9,2,1,5,6,4,3};
        int[] arr = {3,3,3,3,4,3,3,3,3};
//        {3,2,3,1,2,4,5,5,6};
        int n = arr.length;
        print(arr);
        int k = 1;
        ans = -1;
//        quickSelect(arr, 0, n-1,k); // kth smallest
        quickSelect(arr,0,n-1,n-k+1);   // kth largest
        System.out.println(ans);
    }
}

/*
Complexity	Best Case	Average Case	Worst Case
Time	        O(n)	    O(n)	    O(n^2)
Space	    O(log n)	  O(log n)	    O(n)
*/