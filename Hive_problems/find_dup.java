import java.util.*;
class find_dup {
  public static void main(String args[]) {
    System.out.println("Enter the number of array elments");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
        System.out.println("Enter the array elements");
    for(int i = 0 ; i< n;i++) {
      arr[i] = sc.nextInt();
    }

    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i = 0;i<n;i++) {
      if(map.containsKey(arr[i])) {
        
        System.out.println(arr[i]);
      } else {
        map.put(arr[i],1);
      }
    }
  }
}