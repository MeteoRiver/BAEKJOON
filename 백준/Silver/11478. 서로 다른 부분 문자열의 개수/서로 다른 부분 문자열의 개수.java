        import java.io.*;
        import java.util.*;

        public class Main {
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s = br.readLine();
                HashMap<String, Integer> map1 = new HashMap<>();
                for(int i=0; i<s.length(); i++) {
                    for(int j=i+1; j<=s.length(); j++) {
                        map1.put(s.substring(i, j),i);
                    }
                }
                System.out.println(map1.size());
            }
        }