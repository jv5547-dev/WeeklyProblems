package week9and10;

import java.util.Scanner;
//level 3
/*
Find unique characters in a string using the charAt() method and display the result
Hint =>
Create a Method to find the length of the text without using the String method length()
Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array. The logic used here is as follows:
Create an array to store the unique characters in the text. The size is the length of the text
Loops to Find the unique characters in the text. Find the unique characters in the text using a nested loop. An outer loop iterates through each character and an inner loop checks if the character is unique by comparing it with the previous characters. If the character is unique, it is stored in the result array
Create a new array to store the unique characters
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.

 */
public class UniqueChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Get unique characters
        char[] uniqueChars = findUniqueChars(input);

        // Display results
        System.out.print("Unique characters are: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    // Method to find length without .length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static char[] findUniqueChars(String text) {
        int len = getLength(text);
        char[] tempArray = new char[len];
        int uniqueCount = 0;

        // Outer loop to pick each character
        for (int i = 0; i < len; i++) {
            char currentChar = text.charAt(i);
            boolean isDuplicate = false;

            // Inner loop to check if the character appeared before index i
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add to temp array
            if (!isDuplicate) {
                tempArray[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array with the exact size of unique characters found
        char[] finalUniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            finalUniqueChars[i] = tempArray[i];
        }

        return finalUniqueChars;
    }
}