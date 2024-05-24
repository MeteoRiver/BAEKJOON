    import java.io.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int mul = 1;
            if(n==0){
                mul = 1;
            }
            else{
                for (int i = 1; i <= n; i++) {
                    mul*=i;
                }
            }
            System.out.println(mul);
        }
    }
