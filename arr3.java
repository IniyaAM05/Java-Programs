import java.util.*;
class arr3{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(7);
        System.out.println(arr);
        arr.set(2,5);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        arr.add(100);
        arr.add(90);
        arr.add(80);
        System.out.println(arr);
        Collections.sort(arr);//sort
        System.out.println(arr);
        System.out.println(arr.contains(80));//contains
}
}