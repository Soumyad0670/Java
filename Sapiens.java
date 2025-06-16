class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}
interface BasicAnimals{
     void sleep();
     void eat();
}
class Human extends Monkey implements BasicAnimals{
    @Override
    public void sleep(){
        System.out.println("Sleeping");
    }
    @Override
    public void eat(){
        System.out.println("Eating");
    }
}
public class Sapiens {
    public static void main(String[] args){
        Monkey m=new Monkey();
        Human h=new Human();
        m.jump();
        m.bite();
        h.sleep();
        h.eat();
    }
}