abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
@Override
public void refill(){
    System.out.println("Refilling pen");
}
@Override
public void write(){
    System.out.println("Writing with pen");
}
public void changeNib(){
    System.out.println("Changing the nib of the pen");
}
}
public class Abstract {
    public static void main(String[] args) {
        Pen p=new FountainPen();
        p.refill();
        p.write();
        FountainPen fp=new FountainPen();
        fp.changeNib();
    }
}
