import java.util.Scanner;

public class FirstCharacterFinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // get first character
        char firstChar = str.charAt(0);

        System.out.println("First character: " + firstChar);

        sc.close();
    }
}