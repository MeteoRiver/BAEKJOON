import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a = br.readLine();

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            switch (a.charAt(i)) {
                case 'A':
                case 'B':
                case 'C':
                    count += 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    count += 4;
                    break;
                case 'H':
                case 'I':
                case 'G':
                    count += 5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    count += 6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    count += 7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    count += 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    count += 9;
                    break;
                case 'X':
                case 'Y':
                case 'Z':
                case 'W':
                    count += 10;
                    break;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

}