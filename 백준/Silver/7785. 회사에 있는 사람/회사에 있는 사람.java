import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }
        ArrayList<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        Collections.reverse(list);

        for(String s: list) {
            if (map.get(s).equals("enter")) {
                System.out.println(s);
            }
        }
    }
}
