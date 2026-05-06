package week9and10;

//level 2
import java.util.Scanner;

public class ManualLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        int manualLen = getLength(input);
        int builtInLen = input.length();

        System.out.println("Manual length (via Exception): " + manualLen);
        System.out.println("Built-in length: " + builtInLen);
        System.out.println("Results match? " + (manualLen == builtInLen));
    }

    public static int getLength(String str) {
        int count = 0;
        try {
            // Infinite loop to access characters
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception caught when end of string is reached
            return count;
        }
    }
}