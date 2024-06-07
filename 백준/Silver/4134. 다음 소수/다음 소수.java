    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.io.IOException;
    import java.util.Arrays;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            long n = Long.parseLong(br.readLine());
            for(int i = 0;i<n;i++){
                long a = Long.parseLong(br.readLine());
                while(true){
                    if(a==1){
                        System.out.println(2);
                        break;
                    }
                    else if(a==0){
                        System.out.println(2);
                        break;
                    }
                    else if(decimal(a)==1){
                        System.out.println(a);
                        break;
                    }
                    a++;
                }
            }

        }
        public static int decimal(long a) {

            for (int i = 2; i<=Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return 0;
                }
            }
            return 1;
        }
    }