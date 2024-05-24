import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map=new HashMap<>();
        String[] arr=new String[m];
        for (int i = 0; i < n; i++) {
            map.put(br.readLine(),i);
        }
        for(int i=0;i<m;i++){
            arr[i]=br.readLine();
        }
        int count=0;
        for(String s:arr){
            if(map.containsKey(s)){count++;}
        }
        System.out.println(count);
    }
}
