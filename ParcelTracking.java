class ParcelTracking {
    public static void main(String[] args) {

        // 1. Create array and add values
        int[] parcels = {101, 102, 103, 104, 105};

        // 2. Modify one value (correct parcel number)
        parcels[2] = 999;   // changing 3rd parcel

        // 3. Display all parcels using loop
        System.out.println("Parcel Tracking Numbers:");
        for (int i = 0; i < parcels.length; i++) {
            System.out.println(parcels[i]);
        }
    }
}