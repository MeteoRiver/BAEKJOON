        import java.io.*;
        import java.util.StringTokenizer;

        public class Main {
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine());
                long a = Integer.parseInt(st.nextToken());
                long b = Integer.parseInt(st.nextToken());
                long c = pro(a,b);
                System.out.println(c);

            }
            public static long pro(long a,long b){
                return (a+b)*(a-b);
            }
        }

