import java.util.*;
public class ArrayMisingNumbers {
  public static void main(String args[]) {
    Scanner sc = new Scanner (System.in) ;
    System.out.println("Enter the no of array Elemets you want to enter:") ;
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the array Elements");
    for(int i = 0;i<n;i++) {
      arr[i] = sc.nextInt();
    }
   
    for(int  i = 0 ;i<n ;i++ ) {
      if(arr[i] > arr[i++] ) {
        int temp = arr[i];
        arr[i] = arr[i++];
        arr[i++] = temp;
      } 

    } 
    
    System.out.println("Missing numbers are:");
    int num = 1;
    for(int i = 0 ; i < n ; i++) {
      while (num < arr[i]){
        System.out.print(" "+num);
        num ++;
        }
      
      if(num == arr[i]) { 
        num++;
      }
    }
  }
}