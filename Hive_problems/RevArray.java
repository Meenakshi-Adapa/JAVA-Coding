import java.util.*;
class RevArray {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of array elments");
    int n = sc.nextInt();
    System.out.println("Enter the array elements");
    int arr[] = new int[n];
    for(int i=0 ;i<n ;i++) {
      arr[i] = sc.nextInt();
    }
    for(int i = n-1 ; i >= 0 ; i--) {
      System.out.print(arr[i]+" ");
    }
  }
}