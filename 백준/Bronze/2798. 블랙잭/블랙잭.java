import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int b=0;
        int max=0;
        int[] num=new int[n];
        StringTokenizer st1=new StringTokenizer(br.readLine());

        for (int i=0;i<n;i++) {
            num[i]=Integer.parseInt(st1.nextToken());
        }
        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
                for (int k=j+1;k<n;k++) {
                    b=num[i]+num[j]+num[k];
                    if(b<=m&&b>max) {
                        max=b;
                    }
                }
            }
        }
        System.out.println(max);
    }
}