
/*Why do we need constructor chaining? 
This process is used when we want to perform multiple tasks in a single constructor
Rather than creating a code for each task in a single constructor we create a separate constructor for each task and make their chain which makes the program more readable. 
default constructor will call another constructor using this keyword from same class
 */
public class Constructor_Chaining {

    /* default constructor 1
	default constructor will call another constructor
	using this keyword from same class*/
    Constructor_Chaining() {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }
    // parameterized constructor 2

    Constructor_Chaining(int x) {
        // calls constructor 3
        this(x, 15);
        System.out.println(x);
    }
    // parameterized constructor 3

    Constructor_Chaining(int x, int y) {
        System.out.println(x * y);
    }

    public static void main(String args[]) {
        // invokes default constructor first
        Constructor_Chaining o = new Constructor_Chaining();
		o.close();
		
	}
    private void close() {}
}
