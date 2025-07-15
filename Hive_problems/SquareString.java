import java.io.*;
import java.util.*;

public class SquareString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume newline
        for(int i=0; i<t; i++) {
            String s = sc.nextLine().trim();
            int length = s.length();
            if(length % 2 == 0) {
                String sub = s.substring(0, length/2);
                String sub1 = s.substring(length/2);
                if(sub.equalsIgnoreCase(sub1)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}