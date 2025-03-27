import java.io.*;
import java.util.*;

class Main {
    static int count=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int a = 0;
        for (int i = 0; i < t; i++) {
            a=0;
            count = 0;
            String s = br.readLine();
            a = isPalindrome(s);
            System.out.println(a + " " + count);
        }
    }

    public static int recursion(String s, int l, int r){
        count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }


}