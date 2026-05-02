import java.util.*;
class arr{

    public static void main(String[] args){
        int a[] = {1,2,3,4,5};
        int b[] = new int[5];
        b=Arrays.copyOf(a,3);
        for(int i=0;i<b.length;i++)
            System.out.println(b[i]);
    }
}