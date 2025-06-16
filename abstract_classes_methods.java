abstract class Parent2{
    abstract void Wish();
    abstract void sayHello();
    abstract void greet1();
    abstract void greet2();
}
class child2 extends Parent2{// child2 is a real concrete class and it is created from Parent2 class---->child 2 has objects
    @Override
    public void Wish(){
        System.out.println("Saying hello!");
    }
    @Override
    public void sayHello(){
        System.out.println("Hello!");
    }
    @Override
    public void greet1(){
        System.out.println("Good Morning!");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon!");
    }
    public void greet3(){
        System.out.println("Good Evening!");
    }
}
@SuppressWarnings("unused")
abstract class child3 extends Parent2{// auto override as it is a abstract class
    public void greet4(){
        System.out.println("Good Night!");
    }
}
public class abstract_classes_methods {
    public static void main(String[] args) {
        Parent2 p2=new child2();
        child2 c2=new child2();
        // child3 c3=new child3();//not allowed as abstract class
        //Parent2 p2=new Parent2();//not allowed as abstract class
        c2.greet1();
        c2.greet2();
        c2.greet3(); 
        c2.sayHello();
        // c2.Wish();
        p2.greet1();
        p2.greet2();
        p2.sayHello();
        p2.Wish();
    }
}