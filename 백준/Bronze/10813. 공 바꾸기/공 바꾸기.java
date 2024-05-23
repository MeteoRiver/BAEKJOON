import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = 0;
        int[] array = new int[n];
        for (int a = 0; a < n; a++) {
            array[a] = a+1;
        }
        for (int b = 0; b < m; b++) {
            int i=scanner.nextInt();
            int j=scanner.nextInt();
            s=array[i-1];
            array[i-1]=array[j-1];
            array[j-1]=s;
        }
        for (int c = 0; c < n; c++) {
            System.out.print(array[c]+" ");
        }
    }
}