import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String a = st.nextToken();//숫자
        int b = Integer.parseInt(st.nextToken()); //b진법

        int d = 0;
        int e = 0;
        for (int i = a.length() - 1; i >= 0; i--) {

            if (a.charAt(e)>='A'&&a.charAt(e)<='Z') {
                //문자처리
                int c = ((a.charAt(e) - 'A') + 10);
                d += Math.pow(b, i) * c;
                e++;
            } else {
                //숫자처리
                int c = (a.charAt(e) - '0');
                d += Math.pow(b, i) * c;
                e++;
            }
        }

        System.out.println(d);
    }
}