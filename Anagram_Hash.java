import java.util.*;
public class Anagram_Hash{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first string:");
    String a = sc.nextLine();
    System.out.println("Enter the Second string:");
    String b = sc.nextLine();
    HashMap<Character,Integer> map = new HashMap<>();
    HashMap<Character,Integer> map1 = new HashMap<>();
    for(int i = 0;i < a.length();i++) {
       if(map.containsKey(a.charAt(i))) {
             map.put(a.charAt(i),map.get(a.charAt(i))+1);

       } else {
        map.put(a.charAt(i),1);
       }
    }

    for(int i = 0;i < b.length();i++) {
       if(map1.containsKey(b.charAt(i))) {
             map1.put(b.charAt(i),map1.get(b.charAt(i))+1);

       } else {
        map1.put(b.charAt(i),1);
       }
    }
    
    if(map.equals(map1)) {
      System.out.println("Is an Anagram");
    } else {
      System.out.println("not an Anagram");
    }

  }
}