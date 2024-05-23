import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        int c = 0;
        for (int i = 0; i < N;i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            c +=(a*b);
        }
        if(X==c){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
