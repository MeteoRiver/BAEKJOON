import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double cal=0;
        double sum=0;
        double score=0;
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            double b = Double.parseDouble(st.nextToken());
            String c = st.nextToken();

            switch(c) {
                case "A+": cal=4.5*b;break;
                case "A0": cal=4.0*b;break;
                case "B+": cal=3.5*b;break;
                case "B0": cal=3.0*b;break;
                case "C+": cal=2.5*b;break;
                case "C0": cal=2.0*b;break;
                case "D+": cal=1.5*b;break;
                case "D0": cal=b;break;
                case "F": cal=0;break;
                case "P": continue;
            }
            score+=b;
            sum+=cal;
        }
        sum=sum/score;
        System.out.println(sum);
    }
}