import java .util.*;
class GCD_LCM {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    int a = sc.nextInt();
    System.out.println("Enter the Second number");
    int b = sc.nextInt();
    int gcd = findGCD(a,b);
    int lcm = (a*b)/gcd;
    System.out.println("LCM is:"+lcm);
    System.out.println("GCD is :"+gcd);

  }
  public static int findGCD(int a ,int b){
    while(b!=0) {
      int temp = b;
      b = a % b;
      a = temp; 
    }
    return a;
  } 

}