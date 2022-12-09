import java.util.Scanner;

public class MainOne {
    public static void main(String[] args) {
        int number, i;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        System.out.println("Powers of 2: ");

        for (i = 1; i < number; i *= 2) {
            System.out.println(i);
        }
    }
}
