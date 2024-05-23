    import java.io.*;

    public class Main {
        public static boolean[] prime;
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n=Integer.parseInt(br.readLine());
            for(int i=2;i<=n;){
                if(n%i==0){
                    n=n/i;
                    System.out.println(i);
                    continue;}
                i++;
            }
        }
    }
