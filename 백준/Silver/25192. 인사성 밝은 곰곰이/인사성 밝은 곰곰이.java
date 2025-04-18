import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        HashMap<String,String> map = new HashMap<>();

        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = bf.readLine();
            if(s.equals("ENTER")) {
                count+=map.size();
                map.clear();
                continue;
            }
            map.put(s,"1");
        }
        count+=map.size();
        System.out.println(count);
    }
}
