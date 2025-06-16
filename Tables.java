import java.util.*;
public class Tables 
{
static int product (int m,int n,int q)
{
    System.out.println("table of"+" "+n+" "+"upto"+" "+q);
    for(int i=1;i<=q;i++)
    {
        m=n*i;
        System.out.println(m);
    }
    return m;
}
public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    int r=5,p,v;
    System.out.println("Table of which number");
    p=sc.nextInt();
    System.out.println("upto?");
    v=sc.nextInt();
    product(r,p,v);
    sc.close();
}
}
