import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        char a[] = s.toCharArray();
        char b[] = s1.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
       if(Arrays.equals(a,b) ) {
        System.out.println("yes");
       } else {
        System.out.println("no");
       }
    }
}