import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(Integer.parseInt(st.nextToken()),i);
        }
        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i =0;i<m;i++){
             arr2[i] = Integer.parseInt(st1.nextToken());
        }
        for(int value:arr2){
            if(!map.containsKey(value)){
                System.out.print(0+" ");
            }
            else{
                System.out.print(1+" ");
            }
        }
    }
}
