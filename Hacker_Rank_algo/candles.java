import java.util.*;
class candles {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> arr = new ArrayList<>();
    for(int  i =0 ; i< n ; i++) {
      arr.add(sc.nextInt());
    }
    int Max = Collections.max(arr);
    int freq = Collections.frequency(arr,Max);
    System.out.println(freq);
  }
}