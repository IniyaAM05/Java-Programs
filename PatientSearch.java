import java.util.Scanner;

class PatientSearch {
    public static void main(String[] args) {

        int[] ids = {101, 102, 103, 104, 105, 131, 135, 138};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Patient ID to search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == searchId) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Patient ID Found - Available for treatment");
        } else {
            System.out.println("Patient ID Not Found");
        }
    }
}