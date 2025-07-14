import java.util.*;
class MinMax {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    List<Integer> arr = new ArrayList<>();
    for(int i =0 ; i<5 ; i++) {
       arr.add(sc.nextInt());
    } int Max_sum = Integer.MIN_VALUE;
      int Min_sum = Integer.MAX_VALUE;
      int sum = 0;
      for(int i  = 0 ; i < 5 ; i++) {
        for( int j = 0 ; j < 5 ; j++) {
          if(i !=j) {
             sum += arr.get(j);
          }
        }
        if(sum > Max_sum) {
          Max_sum = sum;
      } else if(sum < Min_sum) {
        Min_sum = sum;
      } sum = 0;
     

  } System .out.print(Min_sum+" "+Max_sum);
}
}