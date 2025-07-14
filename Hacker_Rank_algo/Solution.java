import java.util.*;
class Solution {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    List<Long> arr = new ArrayList<>();
    for(int i =0 ; i<5 ; i++) {
       arr.add(sc.nextLong());
    } long Max_sum = Long.MIN_VALUE;
      long Min_sum = Long.MAX_VALUE;
      long sum = 0;
      for(int i  = 0 ; i < 5 ; i++) {
        for( int j = 0 ; j < 5 ; j++) {
          if(i !=j) {
             sum += arr.get(j);
          }
        }
        if(sum > Max_sum) {
          Max_sum = sum;
      }
      
       if(sum < Min_sum) {
        Min_sum = sum;
      } sum = 0;
     

  } System .out.println(Min_sum+" "+Max_sum);
}
}