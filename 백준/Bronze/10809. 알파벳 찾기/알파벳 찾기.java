import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int[] b = new int[26];
        for (int i = 0; i < 26; i++) {
            b[i] = -1;
        }

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
                int c = a.charAt(i);

                if (b[c - 97] == -1) {
                    b[c - 97] = i;
                }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
