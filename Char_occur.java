import java. util.*;

public class Char_occur {
  public static void main(String args[]) {
    System.out.println("Enter the string :");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    char[] chars = s.toCharArray();
    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    for (char ch : chars) {
       if(map.containsKey(ch)) {
        map.put(ch,map.get(ch)+1);
       } else {
        map.put(ch,1);
       }
  }
  for(Map.Entry<Character,Integer> hs : map.entrySet()) {
    System.out.println(hs.getKey() + " " + hs.getValue());
}
  }
}

