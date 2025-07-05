import java.util.*;
class Fibonnaci {
  public static void main(String args[]) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the Number you want Fib Series for:");
    int N = sc.nextInt();
    int a = 0;int b=1;int temp = 0;
    System.out.print(" "+a+" "+b+" ");
    for (int i = 2 ;i< N;i++)
    { temp = a + b;
      System.out.print(temp+" ");
      a = b;
      b = temp ;

    }

  }
}