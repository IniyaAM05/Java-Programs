import java.util.Scanner;

public class expencetracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double total = 0;

        while (true) {
            System.out.print("Enter expense price (Enter 0 to stop): ");
            double price = sc.nextDouble();

            if (price == 0) {
                break; 
            }

            System.out.print("Enter expense name: ");
            String name = sc.next();

            total = total + price;
        }

        System.out.println("Total expences: "+total);
    }
}