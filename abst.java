class abst{
    public static void main(String[] args){
        sample o = new sample();
        int n = o.display();
        o.setter(100);
        System.out.println(n);
    }
}
class sample{
    private int a=10;
    int display(){
        // System.out.println(a);
        return a;
    }
    void setter(int d){
        a=d;
        System.out.println(a);
    }
}