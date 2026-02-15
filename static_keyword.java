/*Static variables in Java are variables that are associated with the class itself rather than with instances of the class. 
They are declared using the static keyword and are shared among all instances of the class.
Important points for static variables:
We can create static variables at the class level only.
static block and static variables are executed in the order they are present in a program.
Shared among all instances: Since there is only one copy of a static member per class, it is shared among all instances of the class. 
This can be useful for maintaining common data or behavior across all instances*/

class Dog{
    String c;
    int a;
    static String type = "Dog";
    static {
        System.out.println("Static block is executed");
    }
    public String getC() {
        return c;
    }
    public int getA() {
        return a;
    }
    public int Labrador(int age, String color){
        System.out.println("Labrador is a breed of dog");
        this.a = age;
        this.c = color;
        return age;
    }
    public int Pug(int age, String color){
        System.out.println("Pug is a breed of dog");
        this.a = age;
        this.c = color;
        return age;
    }
} 
public class static_keyword {    
    public static void main(String[] args) {
        Dog l = new Dog();
        Dog p = new Dog();
        static_keyword s = new static_keyword();
        s.close(); 
        System.out.println("The type of Animal is: " + Dog.type); // accessing static variable using class name
        l.Labrador(5, "Brown");
        System.out.println("The age of the Labrador is: " + l.getA()); // accessing instance variable using object reference
        System.out.println("The color of the Labrador is: " + l.getC()); // accessing instance variable using object reference                                                                          
        p.Pug(3, "Black");
        System.out.println("The age of the Pug is: " + p.getA()); // accessing instance variable using object reference
        System.out.println("The color of the Pug is: " + p.getC()); // accessing instance variable using object reference                                                                          
    }
    private void close() {} // to avoid resource leak warning
}
