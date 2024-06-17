import java.util.Scanner;

public class GameInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t > 0) {
            int n = sc.nextInt();
            t--;

            if (n % 3 == 0) {
                System.out.println("Second");
            } else if (n % 3 == 1) {
                System.out.println("First");
            } else { // n % 3 == 2
                System.out.println("First");
            }
        }

        sc.close();
    }
}
