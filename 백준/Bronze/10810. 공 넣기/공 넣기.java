import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] array = new int[n];
        for (int a = 0; a < n; a++) {
            array[a] = 0;
        }
        for (int b = 0; b < m; b++) {
            int i=scanner.nextInt();
            int j=scanner.nextInt();
            int k=scanner.nextInt();
            //i번부터 j번까지 k번공 삽입
            for (int c=i-1;c<=j-1;c++) {
                array[c]=k;
            }
        }
        for (int d = 0; d < n; d++) {
            System.out.print(array[d]+" ");
        }
    }
}