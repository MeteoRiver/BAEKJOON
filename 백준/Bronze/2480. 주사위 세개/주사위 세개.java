import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        if(A==B&&B==C){
            System.out.println(10000+A*1000);
        }
        else if(A==B||B==C||C==A) {
            if (A == B) {
                System.out.println(1000 + A * 100);
            }
            else if (A == C) {
                System.out.println(1000 + A * 100);
            }
            else {
                System.out.println(1000 + C * 100);
            }
        }
        else
        {
            if(A>B){
                if(A>C){
                    System.out.println(A*100);
                }
                else {
                    System.out.println(C*100);
                }
            }
            else if(B>A){
                if(B>C){
                    System.out.println(B*100);
                }
                else {
                    System.out.println(C*100);
                }
            }
        }
    }
}
