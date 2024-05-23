import java.io.*;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb=new StringBuilder();
        int a = Integer.parseInt(st.nextToken());//10진법 숫자
        int b = Integer.parseInt(st.nextToken()); //b진법
        while (a>0) {
            if(a%b>=10){
                sb.append((char)((a%b)+'A'-10));
            }
            else{
                sb.append((char)(a%b+'0'));
            }
            a/=b;
        }
        sb.reverse().toString();
        for(int i=0;i<sb.length();i++){
            System.out.print(sb.charAt(i));
        }

    }
}
