class A{// A is a type
    public int a;
    public int meth1(){
        return 4;
    }
    public void meth2(){
        System.out.println("Method 2 of class A");
    }
}
class B extends A{// B is a subtype
    @Override
    public void meth2(){
        System.out.println("Method 2 of class B");
    }
    public void meth3(){
        System.out.println("Method 3 of class B");
    }
}
public class method_overriding{//redefining method of super class
    public static void main(String[]args){
        A a=new A();
        a.meth1();
        a.meth2();
        B b=new B();
        b.meth2();   
        b.meth3();   
    }
}