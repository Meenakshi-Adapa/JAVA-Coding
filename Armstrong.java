import java.util.*;
class Armstrong {
  public static void main(String args[]) {
    System.out.println("Enter the number:");
    Scanner sc = new Scanner (System.in);
    int Num = sc.nextInt();
    int len = String.valueOf(Num).length();
    int lst ,pow = 0;
    int num = Num;
    while (Num > 0) {
        lst = Num % 10 ;
        pow += Math.pow(lst,len);
        Num = Num / 10 ;
     }
    if(num == pow ) {
      System.out.println("is an Armstrong Number ");
    } else {
      System.out.println("Not an Armstrong number");
    }
  }
}