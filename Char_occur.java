import java.util.*;
 
 class Char_occur {
     public static void main(String args[]) {
      System.out.println("Enter the string");
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      char[] ch = s.toCharArray();
      HashMap<Character,Integer> map = new HashMap<>();
      for (char c : ch) { if(map.containsKey(c)) {
        map.put(c,map.get(c)+1);
      } else {
        map.put(c,1);
      }


     }
     for(Map.Entry<Character,Integer> hs : map.entrySet()) {
      System.out.println("alphabet : "+hs.getKey()+"   " +"FreqCount : "+hs.getValue());
      System.out.println("\n");
     }
}

 }