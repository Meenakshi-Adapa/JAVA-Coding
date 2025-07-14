import java.util.*;
class grade {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0 ; i< n;i++) {
      arr[i] = sc.nextInt();
    }
    for(int i : arr ) {
      int rund = ((i+4)/5) * 5;
      if(i<38) {
        System.out.println(i);
      }else if((rund-i)<3) {
        i = rund;
        System.out.println(i);
      }else {
      System.out.println(i);
    }
    }
  }
}