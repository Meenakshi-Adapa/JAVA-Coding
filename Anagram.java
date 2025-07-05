import java.util.*;

class Anagram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String a = sc.nextLine();
        System.out.println("Enter the second String");
        String b = sc.nextLine();

        if (isAnagram(a, b)) {
            System.out.println("The strings are anagrams");
        } else {
            System.out.println("The strings are not anagrams");
        }
    }

    public static boolean isAnagram(String a, String b) {
        // Convert to lowercase (for case-insensitive comparison)
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Step 1: Check length
        if (a.length() != b.length()) {
            return false;
        }

        // Step 2: Create count array for a-z
        int[] count = new int[26];

        // Step 3: Update frequency from both strings
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'a']++;  // increment for 'a'
            count[b.charAt(i) - 'a']--;  // decrement for 'b'
        }

        // Step 4: Check if all counts are 0
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
