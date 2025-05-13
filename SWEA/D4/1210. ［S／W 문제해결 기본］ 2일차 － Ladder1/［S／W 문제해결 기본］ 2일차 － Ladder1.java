import java.io.*;
import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[100][100];
        for (int t = 1; t <= 10; t++) {
            int T = Integer.parseInt(br.readLine());
            for (int i = 0; i < 100; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int ansRow = 99;
            int ansCol = 0;
            for (int i = 0; i < 100; i++) {
                if (arr[99][i] == 2) {
                    ansCol = i;
                }
            }
            while (ansRow > 0) {
                //왼쪽이동
                if (ansCol > 0 && arr[ansRow][ansCol - 1] == 1) {
                    while (ansCol > 0 && arr[ansRow][ansCol - 1] == 1) {
                        ansCol--;
                    }
                    ansRow--;
                }
                //오른쪽이동
                else if (ansCol < 99 && arr[ansRow][ansCol + 1] == 1) {
                    while (ansCol < 99 && arr[ansRow][ansCol + 1] == 1) {
                        ansCol++;
                    }
                    ansRow--;
                }
                //위이동
                else {
                    ansRow--;
                }
            }
            System.out.println("#" + T + " " + ansCol);
        }
    }
}
