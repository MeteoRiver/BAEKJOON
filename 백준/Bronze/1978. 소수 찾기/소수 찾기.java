import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        StringTokenizer st;
        int an=0;
        st = new StringTokenizer(br.readLine());
        while (true) {
            int count=0;
            int b=Integer.parseInt(st.nextToken());
            if(b==1){a--;continue;};
            for(int i=2;i<=b;i++){
                if(b%i==0){
                    count++;
                }
            }
            if(count==1){an++;}
            a--;
            if(a==0){break;}
        }
        System.out.println(an);
    }
}