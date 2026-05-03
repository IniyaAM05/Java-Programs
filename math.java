import java.util.*;
class math {

    static double abs(double x) {
        return (x < 0) ? -x : x;
    }

    public static void main(String[] args) {

        double a = 5.7;
        double b = 8.0;

        System.out.println("--- Values ---");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("\n--- Math Function Results ---");

        System.out.println("abs(a) = " + abs(a));
        System.out.println("abs(b) = " + abs(b));

        System.out.println("max(a,b) = " + Math.max(a, b));
        System.out.println("min(a,b) = " + Math.min(a, b));

        System.out.println("pow(a,b) = " + Math.pow(a, b));

        System.out.println("sqrt(a) = " + Math.sqrt(a));
        System.out.println("sqrt(b) = " + Math.sqrt(Math.abs(b))); 

        System.out.println("cbrt(a) = " + Math.cbrt(a));
        System.out.println("cbrt(b) = " + Math.cbrt(b));

        System.out.println("ceil(a) = " + Math.ceil(a));
        System.out.println("floor(a) = " + Math.floor(a));
        System.out.println("round(a) = " + Math.round(a));

        System.out.println("sin(a) = " + Math.sin(a));
        System.out.println("cos(a) = " + Math.cos(a));
        System.out.println("tan(a) = " + Math.tan(a));

    }
}