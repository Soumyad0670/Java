public class MainOverloading {

    // JVM starts execution here
    public static void main(String[] args) {
        System.out.println("Original main method");

        main(10);           // Calling overloaded method
        main("Soumya");     // Calling overloaded method
        main(10, 20);       // Calling overloaded method
    }

    public static void main(int a) {
        System.out.println("Main with int: " + a);
    }

    public static void main(String name) {
        System.out.println("Main with String: " + name);
    }

    public static void main(int a, int b) {
        System.out.println("Main with two ints: " + (a + b));
    }
}
