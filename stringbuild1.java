class arrs {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("");

        char ch[] = {'I','n','i'};

        for(int i=0; i<ch.length; i++) {
            sb.append(ch[i]);
        }
        System.out.println(sb);

        sb.insert(4, "shka");
        System.out.println(sb);

        sb.replace(0, 4, "KANI");
        System.out.println(sb);

        sb.delete(4, 8);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        System.out.println(sb.capacity());

        sb.trimToSize();
        System.out.println(sb.capacity());
    }
}