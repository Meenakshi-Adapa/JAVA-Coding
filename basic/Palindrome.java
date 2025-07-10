import java.util.*;
class Palindrome {
  public static void main(String args[]) {
    System.out.println("Enter the string:");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    StringBuilder str = new StringBuilder(s);
    if(str.reverse().toString().equals(s)) { 
      System.out.println("is a Palindrome");

    } else {
      System.out.println("not a Palindrome");
    }
  }
}