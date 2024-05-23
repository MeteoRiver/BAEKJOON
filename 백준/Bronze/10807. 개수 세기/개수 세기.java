import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int f = scanner.nextInt();
        for (int j = 0; j < n; j++)
        {
            if (f == array[j]) {
                count++;
            }
        }
        System.out.println(count);
    }
}