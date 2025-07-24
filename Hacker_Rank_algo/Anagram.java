 import java.util.*;
 class Anagram{
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();
        b=b.toLowerCase();
         if (a.length() != b.length()){
            return false;
         } else{
            char ch_a[] = a.toCharArray();
            char ch_b[] = b.toCharArray();
            Arrays.sort(ch_a);
            Arrays.sort(ch_b);
            return Arrays.equals(ch_a,ch_b);
            
         }
 }
 public static void main(String args[]) {
    Scanner sc = new Scanner (System.in);
    String a = sc.nextLine();
    String b = sc.nextLine();
    boolean val = isAnagram(a,b);
    System.out.println((val)?"Anagrams":"Not Anagrams");
 }
 }
 