/*question:printing spiral Matrix
    1 -> 2 -> 3-> 4
                  |
    5 -> 6 -> 7   8
    |         |   |
    9  10 <- 11  12
    |             |
    13 <-14 <-15<-16

    top <= bottom
    left <= right
    

*/
import java.util.*;
class spiralMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i = 0; i < row ; i++) {
            for(int j = 0 ; j < col ; j ++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int top = 0;
        int bottom = row-1;
        int left = 0;
        int right = col-1;
        while(top<=bottom && left<=right) {
            for(int i = top ; i <= right ; i++) {
                System.out.print(arr[top][i]+"->");
            } top++;
            for(int i = top ; i <= bottom ; i++) {
                System.out.print(arr[i][right]+"->");
                
            } right--;
            for(int i = right ; i >= left ; i--) {
                System.out.print(arr[bottom][i]+"->");
                
            } bottom--;
            for(int i = bottom ; i >= top ; i--) {
                System.out.print(arr[i][left]+"->");
                
            } left++;

        }
    }
}