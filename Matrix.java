import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i, j;
            int m[][] = new int[4][4];
            int n[][] = new int[4][4];
            System.out.println("Enter the elements of the matrix");
            for (i = 0; i < 4; i++) {
                for (j = 0; j < 4; j++) {
                    m[i][j] = sc.nextInt();
                }
            }
            System.out.println("The matrix");
            for (i = 0; i < 4; i++) {
                for (j = 0; j < 4; j++) {
                    System.out.print(m[i][j] + " ");
                }
                System.out.println();
            }
            for (i = 0; i < 4; i++) {
                for (j = 0; j < 4; j++) {
                    n[j][i] = m[i][j];
                }
            }
            System.out.println("The transpose of the matrix");
            for (j = 0; j < 4; j++) {
                for (i = 0; i < 4; i++) {
                    System.out.print(n[j][i] + " ");
                }
                System.out.println();
            }
        }
    }
}