import java.util.*;
public class Number_Occurence {
  public static void main(String args[]) {
   Scanner sc = new Scanner (System.in);
  System.out.println("enter the number of array elements:");
  int n = sc.nextInt();
  System.out.println("Enter the array elements");
  int arr[] = new int[n];
  int neg_cnt = 0;int pos_cnt = 0;int Zero_cnt = 0;
  for(int  i = 0 ;i < n ; i++) {
    arr[i]  = sc.nextInt();

  }
  for(int i : arr) {
    if(i < 0){
       neg_cnt++;
    } else if(i==0) {
      Zero_cnt++;
    } else if(i>0) {
      pos_cnt++;
    }
  }

  System.out.println(" \nNegitive Count:"+neg_cnt+"\n Positive Count: "+pos_cnt+"\n Zero COunt:" +Zero_cnt);
  }
  
}