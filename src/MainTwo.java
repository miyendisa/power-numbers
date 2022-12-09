import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        int number, i;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        System.out.println("Powers of 4: ");
        for (i = 1; i < number; i *= 4) {
            System.out.println(i);
        }

        System.out.println("Powers of 5: ");
        for (i = 1; i < number; i *= 5) {
            System.out.println(i);
        }
    }
}
