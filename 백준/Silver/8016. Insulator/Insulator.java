import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(a); // 오름차순 정렬

        int[] optimalOrder = new int[n]; // 최적 배치 배열
        int left = 0, right = n - 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                optimalOrder[i] = a[left++];
            } else {
                optimalOrder[i] = a[right--];
            }
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += optimalOrder[i]; // 첫 번째 합
        }

        for (int i = 0; i < n - 1; i++) {
            sum += Math.max(0, optimalOrder[i + 1] - optimalOrder[i]); // 두 번째 합
        }

        System.out.println(sum);
    }
}
