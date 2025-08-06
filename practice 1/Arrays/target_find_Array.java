import java.util.*;
public class target_find_Array{
  public static void main(String args[]) {
      Scanner sc = new Scanner (System.in);
      System.out.println("give the size of array");
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("give target");
      int tar = sc.nextInt();
      boolean flag = true;
      System.out.println("give the elements of array");
      for(int i = 0 ; i < n ; i++) {
        arr[i] = sc.nextInt();
      }
      for(int i = 0 ; i < n ; i++) {
        
        if(tar == arr[i]) {
          System.out.println("target found at index " + i);
          flag = false;
          break;
        } 
      }
      if(flag) {
        System.out.println("-1");
      }
  }
}