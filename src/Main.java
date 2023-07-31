import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a word or sentence to be reversed: ");
        System.out.println(reverseString(scanner.nextLine()));

        scanner.close();
    }

    public static String reverseString(String str) {
        StringBuilder revStr = new StringBuilder();

        for (int i = str.length() - 1; i >= 0 ; i--) {
            revStr.append(str.charAt(i));
        }

        return revStr.toString();
    }
}