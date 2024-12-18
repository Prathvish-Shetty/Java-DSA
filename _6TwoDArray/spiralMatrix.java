package _6TwoDArray;

public class spiralMatrix {

/*
    i : min row ; j : min col -> max col = min row++
    i : min row -> max row ; j : max col = max col--
    i : max row ; j : max col -> min col = max row--
    i : max row -> min row ; j : min col = min col++
*/
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int m = a.length;
        int n = a[0].length;
        int mir = 0,mar = n-1,mic = 0,mac = n-1;
        int c = 1;
        int total = m*n;
//        while(count < total)
        while(mir <= mar && mic <= mac){
            for(int i = mic ; i <= mac ; i++){
//                a[mir][i] = c++;
                System.out.print(a[mir][i]+" ");
            }mir++;
            if (mir > mar || mic > mac) break;

            for(int i = mir ; i <= mar ; i++){
//                a[i][mac] = c++;
                System.out.print(a[i][mac]+" ");
            }mac--;
            if (mir > mar || mic > mac) break;

            for(int i = mac ; i >= mic ; i--){
//                a[mar][i] = c++;
                System.out.print(a[mar][i]+" ");
            }mar--;
            if (mir > mar || mic > mac) break;

            for(int i = mar ; i >= mir ; i--){
//                a[i][mic] = c++;
                System.out.print(a[i][mic]+" ");
            }mic++;
        }
        System.out.println();

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
