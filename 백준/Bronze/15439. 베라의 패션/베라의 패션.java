import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        if(n==1){
            System.out.println("0");
        }
        else{
            System.out.println(n*(n-1));
        }

    }

}
