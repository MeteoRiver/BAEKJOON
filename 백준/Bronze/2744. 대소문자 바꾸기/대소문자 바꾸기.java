        import java.io.*;

        public class Main {
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s= br.readLine();
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)<96){
                        System.out.print((char)(s.charAt(i)+32));
                        //s.replace(s.charAt(i),s.charAt(i)+32);
                    }
                    else if(s.charAt(i)>96){
                        System.out.print((char)(s.charAt(i)-32));
                    }
                }
            }
        }
