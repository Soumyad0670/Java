import java.util.Scanner;
public class Armstrong {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int a,num,s=0;
            num=n;
            while (n>0) {
                a=n%10;
                s=s+a*a*a;
                n=n/10;
            }   if(num==s)
                System.out.println("armstrong");
            else
                System.out.println("not armstrong");
        }
    }
}
