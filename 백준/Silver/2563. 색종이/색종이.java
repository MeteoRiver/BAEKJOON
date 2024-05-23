import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        char[][] arr1 = new char[100][100];
        int a=Integer.parseInt(st.nextToken());
        for(int i=0;i<a;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int b=Integer.parseInt(st1.nextToken());
            int c=Integer.parseInt(st1.nextToken());
            for(int j=b;j<b+10;j++){
                for(int k=c;k<c+10;k++){
                    arr1[j][k] = '*';
                }
            }
        }
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(arr1[i][j] == '*'){count++;}
            }
        }
        System.out.println(count);
        }

    }