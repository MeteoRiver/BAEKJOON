import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int[] temp = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i]=temp[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(temp);

        int key=0;

        for(int value : temp){
            if(!map.containsKey(value)){
                map.put(value,key);
                key++;
           }
        }
        StringBuilder sb = new StringBuilder();
        for (int value : arr) {
            sb.append(map.get(value)+" ");
        }
        System.out.println(sb);
    }
}
