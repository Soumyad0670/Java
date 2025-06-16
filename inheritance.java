class Base{// parent or super class or base class
    int x;
        public int getX(){
            return x;
        }
        public void setX(int x){
            System.out.println("I am setting x now");
            this.x=x;
        }
} 
class Derived extends Base{// subclass or derived class
    int y;
        public int getY(){
            return y;
        }
        public void setY(int y){
            System.out.println("I am a setting y now");
            this.y=y;
        }
}
public class inheritance {
    public static void main(String[] args) {
        Base b=new Base();       
        b.setX(4);
        System.out.println(b.getX());
        Derived d=new Derived();
        d.setX(9);//applicable
        d.setY(7);
        System.out.println(d.getX());//applicable
        System.out.println(d.getY());
    }
}