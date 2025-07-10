import java.util.*;
class Array_duplicate {
  public static void main(String args[]) {
    Scanner sc = new Scanner (System.in) ;
    System.out.println("Enter the number of array elements you want:") ;
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the array elements");
    for(int i = 0; i< n ;i++) {
      arr[i] = sc.nextInt();
    }
 
  

    HashMap <Integer,Integer> map = new HashMap<>();
    for(int i : arr ) {
      if(map.containsKey(i)) {
        map.put(i,map.get(i)+1);

      } else {
        map.put(i,1);

      }
    }
    System.out.println("After sort");

    for (Map.Entry<Integer,Integer> ele :map.entrySet()) {
      System.out.print(ele.getKey()+" ");
      
    }

  }
} 