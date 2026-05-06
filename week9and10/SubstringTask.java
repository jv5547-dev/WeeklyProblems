package week9and10;

import java.util.Scanner;
//level 1
public class SubstringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Custom method call
        String customSub = getManualSubstring(text, start, end);
        // Built-in method call
        String builtInSub = text.substring(start, end);

        System.out.println("Custom Substring: " + customSub);
        System.out.println("Built-in Substring: " + builtInSub);

        // Compare results using the previous comparison logic
        boolean match = compareStrings(customSub, builtInSub);
        System.out.println("Are the substrings identical? " + match);
    }

    public static String getManualSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}