import java.util.*;
class arr2{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(7);
        System.out.println(arr);
        arr.set(2,7);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
}
}