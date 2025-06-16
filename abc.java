class Arithmetic{
    public int add(int a, int b){
        int s=a+b;
        return s;
    }
}
class Adder extends Arithmetic{
    public void A(){
        System.out.println("My superclass is:Arithmetic");
    }
}
public class abc{
    public static void main(String []args){
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}
