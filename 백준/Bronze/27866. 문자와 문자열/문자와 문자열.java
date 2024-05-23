import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;

        public class Main {
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
                String S=br.readLine();
                int i = Integer.parseInt(br.readLine());

                bw.write(S.substring(i-1,i));
                bw.flush();
                bw.close();

                }
        }
