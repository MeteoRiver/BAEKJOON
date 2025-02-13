import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] B = new int[N];
        int[] C = new int[N];

        B[0] = A[0] / 2;
        C[0] = A[0] - B[0];

        if (N > 1) {
            B[1] = A[1] / 2;
            C[1] = A[1] - B[1];

            int dB = B[1] - B[0];
            int dC = C[1] - C[0];

            for (int i = 2; i < N; i++) {
                B[i] = B[i - 1] + dB;
                C[i] = C[i - 1] + dC;

                if (B[i] + C[i] != A[i]) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
        for (int i = 0; i < N; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
