class stringbuild{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("");
        System.out.println(sb);
        char ch[] = {'i','n','i','y','a'};
        for(int i=0;i<ch.length;i++){
            sb.append(ch[i]);
        }
        System.out.println(sb);
    }
}