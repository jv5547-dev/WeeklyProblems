package week9and10;

import java.util.Scanner;
import java.util.Arrays;
//level 1
public class CharArrayTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.next();

        char[] customArray = getCharsManually(input);
        char[] builtInArray = input.toCharArray();

        boolean arraysMatch = compareCharArrays(customArray, builtInArray);

        System.out.println("Custom Array: " + Arrays.toString(customArray));
        System.out.println("Built-in Array: " + Arrays.toString(builtInArray));
        System.out.println("Do arrays match? " + arraysMatch);
    }

    // Method to return characters without toCharArray()
    public static char[] getCharsManually(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}