import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
w부터 시작
->짝수행,짝수열 w
->짝수행,홀수열 b
->홀수행,짝수열 b
->홀수행,홀수열 w

b부터 시작
->짝수행,짝수열 b
->짝수행,홀수열 w
->홀수행,짝수열 w
->홀수행,홀수열 b
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[][] chessB = new boolean[n][m];
        boolean[][] chessW = new boolean[n][m];
        char[][] chess = new char[n][m];

        for (int i = 0; i < n; i++) {
            char[] line = br.readLine().toCharArray(); //한줄 읽고 한 단어씩 인덱스 하나에 넣기
            chess[i] = line;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) {//짝수행, 불일치시 true
                    if (chess[i][j] == 'B') {
                        if (j % 2 == 0) {//짝수행 짝수열인데 B가 오는 경우
                            chessW[i][j] = true;
                        }
                        else{//짝수행 홀수열인데 B가 오는 경우
                            chessB[i][j] = true;
                        }
                    }
                    else if (chess[i][j] == 'W') {
                        if (j % 2 == 0) {//짝수행 짝수열인데 W가 오는 경우
                            chessB[i][j] = true;
                        } else {//짝수행 홀수열인데 W가 오는 경우
                            chessW[i][j] = true;
                        }
                    }
                }
                else{//홀수행, 불일치시 true
                    if (chess[i][j] == 'B') {
                        if (j % 2 == 0) {//홀수행 짝수열인데 B가 오는 경우
                            chessB[i][j] = true;
                        }
                        else {//홀수행 홀수열인데 B가 오는 경우
                            chessW[i][j] = true;
                        }
                    }
                    else if (chess[i][j] == 'W') {
                        if (j % 2 == 0) {//홀수행 짝수열인데 W가 오는 경우
                            chessW[i][j] = true;
                        }
                        else {//홀수행 홀수열인데 W가 오는 경우
                            chessB[i][j] = true;
                        }
                    }
                }
            }
        }


        int min = 2500;
        for(int i = 0; i <= n - 8; i++) {//
            for(int j = 0; j <= m - 8; j++) {
                int countW = 0;
                int countB = 0;
                int countmin=0;
                for(int k = i; k < i + 8; k++) {
                    for(int t = j; t < j + 8; t++) {
                        if(chessW[k][t]) {
                            countW++;
                        }
                        if(chessB[k][t]) {
                            countB++;
                        }
                    }
                }
                //(시작지점을 0,0부터 n-8,m-8까지로 전수조사를 해서 가장 작은 최솟값 찾아내기)
                if(countW > countB) {
                    countmin = countB;
                }
                else if(countB > countW) {
                    countmin = countW;
                }
                else{
                    countmin = countB;
                }
                if(min > countmin) {
                    min = countmin;
                }

            }
        }
        System.out.println(min);
    }
}