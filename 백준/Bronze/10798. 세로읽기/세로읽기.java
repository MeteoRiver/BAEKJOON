import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr1 = new char[5][15];
        int b=0;
        for (int i = 0; i < arr1.length; i++) {
            String a=br.readLine();
            if(a.length()>b){b=a.length();}
            for (int j = 0; j < a.length(); j++) {
                arr1[i][j] =a.charAt(j);

            }
        }

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr1[j][i] == '\0') {continue;}
                System.out.print(arr1[j][i]);
            }
        }

    }
}