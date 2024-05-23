import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[9];
        int x=0;
        int max=0;
        for (int i = 0; i < 9; i++) {
            array[i] = scanner.nextInt();
        }
        for (int j = 0; j < 9; j++)
        {

            if (max < array[j]) {
                max=array[j];
                x=j+1;
            }
        }
        System.out.println(max);
        System.out.println(x);
    }
}