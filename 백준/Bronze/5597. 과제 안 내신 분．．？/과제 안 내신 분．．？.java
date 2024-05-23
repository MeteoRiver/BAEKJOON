import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[30];
        for (int i = 0; i < 28; i++) {
            int a = scanner.nextInt();
            array[a-1] = 1;
        }
        for (int i = 0; i < 30; i++) {
            if (array[i] == 0) {
                System.out.println(i+1);
            }
        }
    }
}