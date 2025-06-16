import java.util.Scanner;
public class computer {
    public static void main(String[] args) {
        /*
        String st="COMPUTER";
        StringBuffer st1=new StringBuffer(st);
        int p=st.length();
        System.out.println(st);
        for(int i=0;i<p;i++)
        System.out.println(st.charAt(i)+"      "+st.charAt(p-1-i));
        System.out.println(st1.reverse());
        
        String st="BLUEJ";
        int p=st.length();
        for(int i=0;i<p;i++)
        {
            System.out.print(st.substring(i,p)+st.substring(0,i));
            System.out.println();
        } 
        */
        Scanner sc=new Scanner(System.in);
        int a,p;
        String str;
        char ch,chr;
        System.out.println("Enter a string in upper case");
        str=sc.nextLine();
        System.out.println("Enter 'F' to display all the first charachters, 'L' to display all the last charachters");
        System.out.println("Enter a charachter");
        ch=sc.next().charAt(0);
        switch (ch) {
            case 'F' -> {
                str=' '+str;
                p=str.length();
                System.out.println("the pattern");
                for(a=0;a<p;a++)
                {
                    chr=str.charAt(a);
                    if(chr==' ')
                        System.out.println(str.charAt(a+1));
                }
            }
            case 'L' -> {
                str=str+' ';
                p=str.length();
                System.out.println("the pattern");
                for(a=0;a<p;a++)
                {
                    chr=str.charAt(a);
                    if(chr==' ')
                        System.out.println(str.charAt(a-1));
                }
            }
            default -> {
                System.out.println("Entered wrong choice");
                sc.close();
            }
        }
        }
}
