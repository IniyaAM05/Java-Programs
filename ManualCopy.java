class ManualCopy {
    public static void main(String[] args) {

        int[] prices = {100, 200, 300, 400, 500, 600};
        int[] copy = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            copy[i] = prices[i];
        }
        System.out.println("Copied Prices:");
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}