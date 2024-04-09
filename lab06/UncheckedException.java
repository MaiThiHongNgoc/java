package lab06;

/**
 * Write a description of class Client here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// them code
    import java.util.Scanner;
    import java.util.InputMismatchException;
public class UncheckedException {
    public UncheckedException() {
    }
    public static void main(String[] args){
        int i , n=2;
        int a[] =new int[n];

        // Declare Scanner Object named input
        Scanner input = new Scanner(System.in);

        try {
            for(i = 0; i < n; i++) { // Corrected loop condition
                System.out.printf("a[%d] = ", i);
                a[i] = input.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        } catch (InputMismatchException e) {
            System.out.println("Input is not an integer!");
        }
    }
}