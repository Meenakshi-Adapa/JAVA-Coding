import java.util.*;
class precision_range {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer>  arr = new ArrayList<>();
    int pos = 0 , neg = 0 , zero = 0;
    for (int i = 0; i < n; i++) {
      arr.add(sc.nextInt());
      if(arr.get(i) < 0) {
        neg++;
      } else if( arr.get(i) > 0) {
        pos++;
      } else if(arr.get(i)==0) {
        zero++;
      }
    } System.out.printf("%.6f\n",(double)pos/n);
      System.out.printf("%.6f\n",(double)neg/n);
      System.out.printf("%.6f\n",(double)zero/n);
}
}