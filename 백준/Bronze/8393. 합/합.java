import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a=0;
        for(int i = 1; i <= N; i++) {
            a += i;
        }
        System.out.println(a);
    }
}