/* Static blocks in Java are used for static initialization of a class. 
They are executed only once when the class is loaded into memory, and they are executed in the order they appear in the class. 
Static blocks are particularly useful for initializing static variables or performing one-time initialization tasks.*/
public class Static_Blocks {
    // Static variable
    static int staticVariable;

    // Static block
    static {
        // Initialize static variable
        staticVariable = 10;
        System.out.println("Static block initialized. Static variable value: " + staticVariable);
    }

    // Main method
    public static void main(String[] args) {
        // Accessing static variable
        System.out.println("Value of staticVariable in main method: " + staticVariable);
    }
}
