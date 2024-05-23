import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int k = n-i; k >= 1; k--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++) {
            for(int k = 0 ; k < i; k++) {
                System.out.print(" ");
            }
            for(int j = ((2*n)-(2*i)); j >= 2; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}