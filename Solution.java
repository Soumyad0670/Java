import java.util.*;
public class Solution {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N%2==0)
        System.out.println("Weird");
        else if(N<=5 && N>=2 && N%2==0)
        System.out.println("Not Weird");
        else if(N<=20 && N>=6 && N%2==0)
        System.out.println("Weird");
        else if(N>20 && N%2==0)
        System.out.println("Not Weird");
        scanner.close();
    }
}
