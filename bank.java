import java.util.Scanner;
class bank{
    public static void main(String[] args){
        int pin_no = 2006;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your pin: ");
        int pin = sc.nextInt();
        sample o = new sample();
        if(pin_no == pin){
            System.out.print("1.Check balance\n2.Deposit");
            System.out.print("Enter your choice: (1/2)");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println(o.getBalance());
            }
            else if(choice == 2){
                System.out.print("Enter your amount: ");
                double amt = sc.nextDouble();
                o.deposit(amt);
                System.out.println("Amount "+ amt +" deposited successfully");
                System.out.println("Updated Balance: "+ o.getBalance());
            }
            else if(choice == 3){
                System.out.println("Exited Successfully...");
            }
            else{
                System.out.println("Invalid choice");
            }
        }
        else{
            System.out.println("Incorrect Pin!!");
        }
    }
}
class sample{
    private double balance = 5000.00;

    double getBalance(){
        return balance;
    }
    void deposit(double amount){
        balance += amount;
    }
}