import java.io.*;
import java.util.*;

public class terenerArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i< n ;i++) {
            arr[i] = sc.nextInt();
        }
        int b[] = new int[3]; 
        int total_cst = 0;
        
        for(int i = 0 ; i < n ; i++) {
            int min_cost = Integer.MAX_VALUE;
            for(int j = 0 ; j<3 ; j++) {
                if(arr[i]!=j && Math.abs(arr[i]-j)<min_cost){
                    b[j] = j;
                    min_cost = Math.abs(arr[i]-b[j]);
                    
                }
            } total_cst += min_cost;
        }System.out.println(total_cst);
    
    
    }
}