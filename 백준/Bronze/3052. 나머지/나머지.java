import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;
        int count1=0;
        int[] array = new int[30];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
            array[i] = array[i]%42;
        }

        for (int i = 0; i < 10; i++) {
            count=0;
            for (int j = i+1; j < 10; j++) {
                if (array[i] == array[j]) {
                    count++;
                }

            }
            if (count==0) {
                count1++;
            }
        }
        System.out.println(count1);

    }
}