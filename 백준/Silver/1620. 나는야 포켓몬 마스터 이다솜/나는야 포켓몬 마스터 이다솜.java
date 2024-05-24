import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> map1 = new HashMap<>();
        String[] arr=new String[m];
        for (int i = 0; i < n; i++) {
            String a = br.readLine();
             map.put((i+1)+"",a);
             map1.put(a,(i+1)+"");
        }
        for (int i = 0; i < m; i++) {
             arr[i] = br.readLine();
        }
        for(String s: arr){
            if(map.containsKey(s)){
                System.out.println(map.get(s));
            }
            else if(map1.containsKey(s)){
                    System.out.println(map1.get(s));
                }
            }
        }
    }
