import java.util.*;
class String_rev {
  public static void main(String[] args) {
    System.out.println("enter the string");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String s1="";
    for (int i = s.length()-1;i >= 0;i--) {
      char ch = s.charAt(i);
      s1+=ch;
    }
    System.out.println(s1);
  }
}