import java.io.*;
import java.util.*;

public class AlternateArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[m];
        for(int i =0 ; i<m ; i++){
            arr[i] = sc.nextInt();
        } int cnt = 0;
        for(int i = 0 ; i < m ; i++) {

                if(arr[i]==0) {
                    boolean left = (i-1 < 0)  || arr[i-1]!=1;
                    boolean right = (i+1 >= m) || arr[i+1]!=1;

                    if(left && right ) {
                        
                        arr[i] = 1;
                        cnt++;
                        
                    }
                }
    
        } 
        if(cnt >= n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    
    
    
    }
}