import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int arr[][] = new int[n][n];
        int sum = 0;
         for(int p =0 ; p < n ; p++) {
            for (int  q= 0; q < n ; q++) {
                arr[p][q] = sc.nextInt();
            }
         }
        for(int p = i; p <= k; p++) {
            for (int q = j; q <= l; q++) {
                sum += arr[p][q];
            }
        }
        System.out.println(sum);

    }
}
