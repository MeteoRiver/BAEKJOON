import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringBuilder sb = new StringBuilder();
            String s = br.readLine();
            if(s.equals("0")){
                break;
            }
            sb.append(s);
            String u = sb.reverse().toString();
            if(s.equals(u)){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}