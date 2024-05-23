import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            String s = scanner.next();
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < a; k++) {
                System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }

    }
}
