import java.util.*;
class Fact_rec {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the fib number:");
    int N = sc.nextInt();
    System.out.println("Factorial is:"+rec_fact(N));
    
  }
  static int rec_fact(int N) {
    if(N==0 || N==1) {
      return 1 ;
    } else {
     return N * rec_fact(N-1);
    }
  }
}