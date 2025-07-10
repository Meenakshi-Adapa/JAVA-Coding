import java.util.*;
class MergeArrays {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in) ;
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i< n;i++) {
      arr[i] = sc.nextInt();
    }
    int n1 = sc.nextInt();
    int arr1[] = new int[n1];
    for(int i = 0;i< n1;i++) {
      arr1[i] = sc.nextInt();
    }
    int merge[] = new int[n+n1];
    int i = 0;int j = 0;int k = 0;
    while(i<n && j<n1) {
      if(arr[i] <= arr[j]) {
        merge[k++] = arr[i++];
      } else {
        merge[k++] = arr1[j++];
      }
    }
    while(i<n) {
      merge[k++] = arr[i++];

    }
     while(j<n1) {
      merge[k++] = arr1[j++];
    }
    
    for( int x : merge) {
      System.out.println(" "+x);
    }
  }
}