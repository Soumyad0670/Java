public class string_substring {
    public static void main(String[] args) {
        String st="COMPUTER";
        StringBuffer st1=new StringBuffer(st);
        int p=st.length();
        System.out.println(st);
        for(int i=0;i<p;i++)
        System.out.println(st.charAt(i)+"      "+st.charAt(p-1-i));
        System.out.println(st1.reverse());
    }
}
