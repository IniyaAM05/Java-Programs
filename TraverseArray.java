public class TraverseArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50}; // array with values

        System.out.println("Traversing array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " = " + arr[i]);
        }
    }
}