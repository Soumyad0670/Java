//package codewithharry.gym;
import codewithharry.gym.HarryGym;
class Using extends HarryGym{
    public void meth2(){
    System.out.println(x);
    System.out.println(y);
    // System.out.println(z);
    // System.out.println(a);
    }
}
public class UsingPackage{
    public static void main(String[]args){
        System.out.println("I am using packages in java");
        // Using c=new Using();
        // c.meth2();
        HarryGym c=new HarryGym();
        System.out.println(c.x);
    }
}
