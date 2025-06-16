public class Pattern 
{
public static void main(String[]args)
{
        int i,j,k=1,p=5,d=1;
        for(i=1;i<=5;i++){
            for(j=1;j<=p;j++)                                  
            System.out.print(j);                    
            for(k=1;k<=d;k++)
            System.out.print(" ");
            for(k=p;k>=1;k--)
            System.out.print(k);
            System.out.println();
            p=p-1;d=d+2;
        }
        int a,b,r=9;
        for(a=1;a<=5;a++)
        {
            for(b=1;b<=a;b++)
            System.out.print(b);
            for(k=r;k>=1;k--)
            System.out.print(" ");
            for(k=a;k>=1;k--)
            System.out.print(k);
            System.out.println();
            r=r-2;         
        }
    }
}