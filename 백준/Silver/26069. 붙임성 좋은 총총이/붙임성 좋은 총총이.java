import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        map.put("ChongChong",0);
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String s = st.nextToken();
            String t = st.nextToken();
            if(map.containsKey(s)) {
                map.put(t, map.getOrDefault(t, 0) + 1);
            }
            else if(map.containsKey(t)) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        System.out.println(map.size());
    }
}
