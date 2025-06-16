public class Basic {
    public static void main(String[] args) {
        System.out.println("Starting basic tests...");
        
        // Test simple addition
        int result = add(5, 3);
        System.out.println("Testing addition: 5 + 3 = " + result);
        
        // Test string concatenation
        String test_string = combineStrings("Hello", "World");
        System.out.println("Testing string concatenation: " + test_string);
        
        System.out.println("All tests completed!");
    }
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static String combineStrings(String str1, String str2) {
        return str1 + " " + str2;
    }
}