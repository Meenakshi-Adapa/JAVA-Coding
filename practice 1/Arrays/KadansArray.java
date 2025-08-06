import java.util.*;
public class KadansArray {
  public static void main(String args[]) {

    int arr[] = {-2,-3,4,-1,-2,1,5,-3}; 
    
    int maxSum = Integer.MIN_VALUE;
    int curr_Sum = 0;
    int strt = 0;
    int lst = 0;

    for ( int i = 0 ; i< 8; i++) {
      
          curr_Sum += arr[i];
          if(curr_Sum < 0 ){
            curr_Sum = 0 ;
          } 
          
          if(curr_Sum > maxSum ){
            maxSum = curr_Sum ;
            lst = i;
          }
          if ( curr_Sum == 0 ) {
            strt = i + 1;
          } 
      
    }
    System.out.println("MAx sub array");
    for( int i = strt; i <= lst ;i++) {
        
        System.out.print(arr[i]+" ");
    } 
    System.out.println(maxSum);
  }
}