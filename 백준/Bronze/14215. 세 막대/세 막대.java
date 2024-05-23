import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr = new int[3];
        st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1]= Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());
        //오름차순 정렬
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
        //양 변의 합이 긴 변의 길이보다 클 때->세변의 합이 삼각형의 둘레
        if (arr[0] + arr[1] > arr[2]) {
            System.out.println(arr[0] + arr[1] + arr[2]);
        }
        //양 변의 합이 긴 변의 길이보다 작을 때
        else {
            System.out.println(2*arr[0] + 2*arr[1] - 1);
        }
    }
}