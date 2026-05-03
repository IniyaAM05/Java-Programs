import java.util.Arrays;

class ArrayCopy {
    public static void main(String[] args) {

        int[] original = {10, 20, 30, 40, 50};

        int[] copy1 = original.clone();

        int[] copy2 = Arrays.copyOf(original, original.length);

        int[] copy3 = new int[original.length];
        System.arraycopy(original, 0, copy3, 0, original.length);

        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Clone Copy: " + Arrays.toString(copy1));
        System.out.println("Arrays.copyOf: " + Arrays.toString(copy2));
        System.out.println("System.arraycopy: " + Arrays.toString(copy3));
    }
}