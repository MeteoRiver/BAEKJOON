import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = bf.readLine();
            if(s.length()>=m) {
                map.put(s, map.getOrDefault(s, 1) + 1);
            }
        }
        List<String> words = new ArrayList<>(map.keySet());

        words.sort((w1, w2) -> {
            int freq1 = map.get(w1);
            int freq2 = map.get(w2);
            if (freq1 != freq2) return Integer.compare(freq2, freq1);
            if (w1.length() != w2.length()) return Integer.compare(w2.length(), w1.length());
            return w1.compareTo(w2);
        });

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(word).append('\n');
        }

        System.out.print(sb);
    }
}
