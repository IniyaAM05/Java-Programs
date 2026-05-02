import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of expenses: ");
        int n = sc.nextInt();

        double total = 0, foodTotal = 0;

        for (int i = 0; i < n; i++) {

            System.out.print("Amount: ");
            double amt = sc.nextDouble();

            System.out.print("Category: ");
            String cat = sc.next();

            total += amt;

            if (cat.equalsIgnoreCase("Food")) {
                foodTotal += amt;
            }

            System.out.println(cat + " : " + amt);
        }

        System.out.println("Total Expense: " + total);
        System.out.println("Food Expense: " + foodTotal);

        sc.close();
    }
}
