class LibrarySort {
    public static void main(String[] args) {

        int[] books = {90, 70, 80, 30, 20, 40, 60, 50};
        for (int i = 0; i < books.length; i++) {
            for (int j = i + 1; j < books.length; j++) {
                if (books[i] > books[j]) {

                    int temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
        System.out.println("Sorted Book IDs:");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
}