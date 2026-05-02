import java.util.Scanner;

public class StartsWithCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // check starts with "Java"
        if (str.startsWith("Java")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}