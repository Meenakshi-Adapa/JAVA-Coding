import java.util.*;
class Gauntlets {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0 ;i<n ;i++) {
      arr[i] = sc.nextInt();
    }
    int p = 0;
    for( int i = 0 ;i < n ; i++) {
      for(int j = 0;j< n; j ++) {
         if(i!=j && arr[i]==arr[j] && arr[i]!=-1 && arr[j]!=-1){
            p++;
            arr[i]=-1;
            arr[j]=-1;
         }
      } 
    } System.out.println(p);
  }
}