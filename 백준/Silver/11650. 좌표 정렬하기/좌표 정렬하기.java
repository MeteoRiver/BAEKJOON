import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,(arr1,arr2)->{
            if(arr1[0]==arr2[0]){
                return arr1[1]-arr2[1];
            }                         
            return arr1[0]-arr2[0];
        });


        for(int i=0;i<n;i++){
            bw.write(arr[i][0]+" "+arr[i][1]+"\n");
        }
        bw.flush();
    }
}