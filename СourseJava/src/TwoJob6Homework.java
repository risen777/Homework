import java.util.Scanner;

/**
 * Created by user on 14.03.2017.
 */
public class TwoJob6Homework {
    public static void main(String[] args) {
        System.out.println("Введи натуральное число");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        for (int i = 1; i <= value; i++) {
            if ((value % i) == 0) {
                System.out.println(i);

            }

        }
    }}
