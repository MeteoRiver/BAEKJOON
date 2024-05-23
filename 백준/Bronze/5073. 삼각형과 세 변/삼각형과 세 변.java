import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr = new int[3];
        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 && c == 0) {
                break;
            } else {
                arr[0] = a;
                arr[1] = b;
                arr[2] = c;
                for (int i = 0; i < 3; i++) {
                    if (i == 2) {
                        break;
                    } else if (arr[i] > arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        i = -1;
                    }
                }
                if (arr[0] + arr[1] > arr[2]) {
                    if (a == b && b == c) {
                        System.out.println("Equilateral");
                    } else if (a == b || b == c || c == a) {
                        System.out.println("Isosceles");
                    } else {
                        System.out.println("Scalene");
                    }
                } else {
                    System.out.println("Invalid");
                }

            }
        }

    }
}
