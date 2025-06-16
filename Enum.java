/*An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma.
Note that they should be in uppercase letters
Properties of Enum in Java:
Every enum is internally implemented by using Class.
Every enum constant represents an object of type enum.
Enum type can be passed as an argument to switch statements.
Every enum constant is always implicitly public static final. Since it is static, we can access it by using the enum Name. 
Since it is final, we can’t create child enums.
We can declare the main() method inside the enum. Hence we can invoke the enum directly from the Command Prompt.
Enum and Inheritance
All enums implicitly extend java.lang.Enum class. As a class can only extend one parent in Java, an enum cannot extend anything else.
toString() method is overridden in java.lang.Enum class, which returns enum constant name.
enum can implement many interfaces.
Enum and Constructor
Enum can contain a constructor and it is executed separately for each enum constant at the time of the enum class loading.
We can’t create enum objects explicitly and hence we can’t invoke the enum constructor directly.
Enum and Methods
Enum can contain both concrete methods and abstract methods. 
If an enum class has an abstract method, then each instance of the enum class must implement it.
*/
enum Level {//Enum declaration can be done outside a Class or inside a Class but not inside a Method
    LOW,
    MEDIUM,
    HIGH
}
public class Enum {
    public static void main(String[] args) {
      Level myVar = Level.MEDIUM;
  
      switch(myVar) {
        case LOW:
          System.out.println("Low level");
          break;
        case MEDIUM:
           System.out.println("Medium level");
          break;
        case HIGH:
          System.out.println("High level");
          break;
      }
    }
  }
/*In Java, Enumerations or Java Enum serve the purpose of representing a group of named constants in a programming language. 
Java Enums are used when we know all possible values at compile time, such as choices on a menu, rounding modes, command-line flags, etc. 
The set of constants in an enum type doesn’t need to stay fixed for all time.
What is Enumeration or Enum in Java?
A Java enumeration is a class type. Although we don’t need to instantiate an enum using new, it has the same capabilities as other classes. 
This fact makes Java enumeration a very powerful tool. 
Just like classes, you can give them constructors, add instance variables and methods, and even implement interfaces.
 */
  