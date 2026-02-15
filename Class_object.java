class Dog {
    void bark() {
        System.out.println("Woof");
    }
}

public class Class_object {
    public static void main(String[] args) throws Exception {

        //Getting Class object using .class
        Class<?> c1 = Dog.class; 
        /*
        * Class is a built-in class in Java that represents the metadata of a class at runtime.
        * <?> is a wildcard that represents an unknown type. It indicates that c1 can hold a reference to a Class object of any type.
        * c1 is an instance of Class that contains metadata about the Dog class, such as its methods, fields, constructors, etc.
        * When you use Dog.class, you are obtaining the Class object associated with the Dog class.
        * This Class object contains information about the Dog class, such as its methods, fields, constructors, and other metadata.
        */

        //Print class name
        System.out.println("Class name: " + c1.getName());

        //Getting Class object using getClass()
        Dog d = new Dog();
        Class<?> c2 = d.getClass();
        /*
        * d.class is a compile-time reference to the Class object of Dog.
        * While d.getClass() is a runtime method that returns the Class object of the actual instance d.
        */

        System.out.println("Demo of the method name and class name by taking c2 as example:");
        for (var method : c2.getDeclaredMethods()) {
            System.out.println(c2);
            System.out.println(c2.getName() + "." + method.getName());
        }

        //Getting Class object using Class.forName()
        Class<?> c3 = Class.forName("Dog");
        /*
        * Class.forName("Dog") is a static method that takes the fully qualified name of the
        * class as a string and returns the corresponding Class object.
        */

        //Dynamically create object using Class object
        Dog newDog = (Dog) c3.getDeclaredConstructor().newInstance();
        /*
        *  The getDeclaredConstructor().newInstance() method is used to create a new instance of the class represented by c3.
        *  It first retrieves the default constructor of the class using getDeclaredConstructor(), and then creates a new instance using newInstance().
        * The resulting object is of type Object, so we need to cast it to Dog to use it as a Dog object.
        */
        newDog.bark();
    }
}
