import java.util.*;
public class Second_Largest {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the size of array elements:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the array elements:");
   
    for( int i = 0 ;i < n ; i ++) {
        arr[i] = sc.nextInt();
    }
    int max = 0 ,Second_max = 0;
    for (int i = 0 ;i< n ;i++ ) {
      if (arr[i]==arr[n-1]){
        Second_max = max;
      }
     if(max < arr[i]){
      max = arr[i] ;
     
     }
     
    }
    
    System.out.println("Second MAx is :"+Second_max);

  }
}