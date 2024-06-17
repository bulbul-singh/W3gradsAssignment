import java.util.Scanner;

public class triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t>0) {
            int n = sc.nextInt();
            t--;
            if (n < 6 || n == 9) {
                System.out.println("NO");

            } else {
                int c = n - 3;

                if (c % 3 == 0) {
                    System.out.println("YES");
                    System.out.println("1 4 " + (n - 5));
                } else {
                    System.out.println("YES");
                    System.out.println("1 2 " + (n - 3));
                }
            }
        }
    }

}
