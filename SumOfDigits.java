import java.util.*;
class SumOfDigits {
  public static void main(String args[]) {
    System.out.println("Enter the Number");
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt();
    int dig,sum = 0;
    while(num>0) {
      dig = num % 10;
      sum += dig;
      num = num / 10;
    }
    System.out.println("Sum of digits: " + sum);
  }
}