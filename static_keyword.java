/*Static variables in Java are variables that are associated with the class itself rather than with instances of the class. 
They are declared using the static keyword and are shared among all instances of the class.
Important points for static variables:
We can create static variables at the class level only.
static block and static variables are executed in the order they are present in a program.
Shared among all instances: Since there is only one copy of a static member per class, it is shared among all instances of the class. 
This can be useful for maintaining common data or behavior across all instances*/
public class static_keyword {
    static int staticVariable = 5;
    static void meth3(){
        System.out.println(staticVariable);
    }
    static void meth4(){
        staticVariable = 20;
        System.out.println(staticVariable);
    }
    static void meth5(){
        staticVariable = 20;
        System.out.println(staticVariable);
    }
    static void meth6(){
        staticVariable = 30;
        System.out.println(staticVariable);
    }
    public static void main(String[] args) {
        meth3();
        meth4();
        meth5();
        meth6();
    }
}
