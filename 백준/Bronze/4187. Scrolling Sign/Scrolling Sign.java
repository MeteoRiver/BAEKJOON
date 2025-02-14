import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int k = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            String[] arr = new String[w];

            for (int j = 0; j < w; j++) {
                arr[j] = bf.readLine();
            }
            sb.append(count(k,arr)).append("\n");
        }
        System.out.println(sb.toString());
    }

    public static int count(int k, String[] arr){
        int length = k;

        for(int i = 1; i < arr.length; i++){
            int count = 0;

            for(int j = 1; j <= k; j++){
                if(arr[i-1].substring(k - j).equals(arr[i].substring(0,j))){
                    count = j;
                }
            }
            length += k - count;
        }
        return length;
    }
}
