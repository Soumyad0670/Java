class Dog {
    String name = "Tommy";

    @Override
    public String toString() { 
        return "Dog name: " + name;
    }

    Object Labrador() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

public class Object_class {
    public static void main(String[] args) {

        // Upcasting to Object class
        Object obj = new Dog();

        // Calling Object methods
        System.out.println(obj.toString());     // overridden method
        System.out.println(obj.hashCode());     // from Object
        System.out.println(obj.getClass());     // from Object

        // Comparing objects
        Object obj2 = new Dog();
        System.out.println(obj.equals(obj2));   // default equals (reference comparison)
    }
}
