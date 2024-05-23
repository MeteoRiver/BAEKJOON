import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr1= new int[9][9];
        int max=0;
        int m=0;
        int n=0;
        for(int i=0; i<9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(arr1[i][j]>max) {
                    max = arr1[i][j];
                    m=i;
                    n=j;
                }
            }
        }
        System.out.printf("%-3d\n",max);
        System.out.println((m+1)+" "+(n+1));
    }
}