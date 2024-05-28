    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;

    public class Main {

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            System.out.println(x(n,m)/y(n,m));
        }

        public static int x( int a, int b) {//분자
            int c = a;
            if(b==0){
                return 1;
            }
            for(int i=1;i<b;i++) {
                a=a*(c-i);
            }
            return a;
        }
        public static int y( int a, int b){//분모
            if(b==0){
                return 1;
            }
            return b*y(a,b-1);
        }

    }