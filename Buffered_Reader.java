import java.io.*;
public class Buffered_Reader {
    public static void main(String[] args) throws IOException {
        int g,b,ga,ba;
        float pg,pb;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter no. of girls and boys");
        g=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        System.out.println("Enter no. of girls and boys absent");
        ga=Integer.parseInt(in.readLine());
        ba=Integer.parseInt(in.readLine());
        pg=(float)(g-ga)/(g+b)*100;
        pb=(float)(b-ba)/(g+b)*100;
        System.out.println(pg);
        System.out.println(pb);
        }
}