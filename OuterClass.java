/*A class can be made static only if it is a nested class.
We cannot declare a top-level class with a static modifier but can declare nested classes  as static.
Such types of classes are called Nested static classes.
A nested static class doesn’t need a reference of the Outer class.
In this case, a static class cannot access non-static members of the Outer class.*/
public class OuterClass {
    // Static nested class
    static class StaticNestedClass {
        void display() {
            System.out.println("This is a static nested class.");
        }
    }
    public static void main(String[] args) {
        // Creating an instance of the static nested class
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        // Calling the method of the static nested class
        nestedObject.display();
    }
}
