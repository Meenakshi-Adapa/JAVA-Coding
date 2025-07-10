import java.util.*;
class ArrayA_usingB {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int A[] = new int[n];
    for(int i = 0 ;i<n;i++) {
      A[i] = sc.nextInt();
    }
    int n1 = sc.nextInt();
    int B[] = new int[n1];
    for(int i = 0 ;i<n;i++) {
      B[i] = sc.nextInt();
    }
    
    for(int i = 0 ; i < n1 ; i++ ) {
        int x = B[i];
        if(x < n) {
          System.out.print(A[x]+" ");
        } else {
          System.out.print("-1 ");
        }
    }

  }
}