import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine().toUpperCase();
        int[] b = new int[26];
        for (int i = 0; i < 26; i++) {
            b[i] = 0;
        }
        int a=0;
        for(int i=0;i<s.length();i++){
            a =s.charAt(i)-65;
            b[a]++;
        }

        int max=0;
        int c=-2;

        for(int i=0;i<26;i++){
            if(max<b[i]){c=i;max=b[i];}
            else if(max==b[i]){c=-2;}

        }
    System.out.println((char)(65+c));
    }
}