
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int C = scanner.nextInt();
        H=H+(C/60);
        M=M+(C%60);

            if(M>=60) {
                H = H + 1;
                M = M - 60;
                if(H>23) {
                    H = H - 24;
                }
            }
            else if(H>23) {
                H = H - 24;
            }
            System.out.println(H+" "+M);
    }
}