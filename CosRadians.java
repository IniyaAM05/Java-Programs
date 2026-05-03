import java.util.Scanner;
class CosRadians {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double degrees = sc.nextDouble();
        double radians = Math.toRadians(degrees);
        double result = Math.cos(radians);
        System.out.println("Cos value: " + result);
    }
}