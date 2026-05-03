import java.util.Random;
import java.util.Arrays;
class rand{
    public static void main(String[] args){
        Random rn = new Random();
        int n = rn.nextInt(5);
        System.out.println(n);
        boolean b = rn.nextBoolean();
        System.out.println(b);
        double g = 10 + (2*rn.nextGaussian());
        System.out.println(g);

        byte bt[] = new byte[5];
        System.out.println(Arrays.toString(bt));
        rn.nextBytes(bt);
        System.out.println(Arrays.toString(bt));
    }
}