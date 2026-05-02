public class ModifyArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        arr[2] = 99; // change 30 → 99

        System.out.println("After modification:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}