package week9and10;

import java.util.Scanner;
import java.util.Arrays;

public class ManualSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();

        // 1. Manual Split
        String[] customWords = splitManually(input);

        // 2. Built-in Split
        String[] builtInWords = input.split(" ");

        // 3. Comparison
        boolean areEqual = compareArrays(customWords, builtInWords);

        System.out.println("Custom Split: " + Arrays.toString(customWords));
        System.out.println("Built-in Split: " + Arrays.toString(builtInWords));
        System.out.println("Arrays are identical? " + areEqual);
    }

    // Method to find length without .length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] splitManually(String text) {
        int len = getLength(text);
        int spaceCount = 0;

        // Count spaces to determine word count
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }

        // Store indices of spaces
        int[] spaceIndices = new int[spaceCount];
        int indexTracker = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndices[indexTracker++] = i;
            }
        }

        // Create array to store words (words = spaces + 1)
        String[] words = new String[spaceCount + 1];
        int start = 0;

        for (int i = 0; i < spaceCount; i++) {
            words[i] = extractSubstring(text, start, spaceIndices[i]);
            start = spaceIndices[i] + 1;
        }
        // Extract the last word
        words[spaceCount] = extractSubstring(text, start, len);

        return words;
    }

    // Helper to extract word using charAt
    public static String extractSubstring(String str, int start, int end) {
        String res = "";
        for (int i = start; i < end; i++) {
            res += str.charAt(i);
        }
        return res;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
}