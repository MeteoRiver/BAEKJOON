import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());
        int max=-10000,max1=-10000;
        int min=10000,min1=10000;
        if(a<=1){
            System.out.println(0);
        }
        else{
        for(int i=0;i<a;i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            if (x>max){
                max=x;
            }
            if (x<min){
                min=x;
            }
            if (y>max1){
                max1=y;
            }
            if (y<min1){
                min1=y;
            }
        }
        System.out.print((max-min)*(max1-min1));
    }
    }
}