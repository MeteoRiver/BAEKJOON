    import java.io.*;
    import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr=new int[4];
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            arr[2] = w-arr[0];
            arr[3] = h-arr[1];
            int min=arr[0];
            for(int i=0; i<4; i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            System.out.println(min);
        }
    }