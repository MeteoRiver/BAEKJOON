import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int max=array[0];
        int min=array[0];
        for (int j = 0; j < n; j++)
        {

            if (max < array[j]) {
                max=array[j];
            }
            else if (min > array[j]) {
                min=array[j];
            }
        }
        System.out.print(min+" ");
        System.out.print(max);
    }
}