import java.util.*;

public class Main {
    static int K;
    static int count = 0;
    static int result = -1;

    public static void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    public static void merge(int[] A, int p, int q, int r) {
        int[] tmp = new int[r - p + 1];
        int i = p, j = q + 1, t = 0;

        while (i <= q && j <= r) {
            if (A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
        }

        while (i <= q) tmp[t++] = A[i++];
        while (j <= r) tmp[t++] = A[j++];

        i = p; t = 0;
        while (i <= r) {
            A[i] = tmp[t];
            count++;
            if (count == K) {
                result = A[i];
            }
            i++; t++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        mergeSort(A, 0, N - 1);
        System.out.println(result);
    }
}
