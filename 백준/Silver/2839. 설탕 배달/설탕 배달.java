import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int a=0;
        int b=0;
        int count=0;
                for(int i=0;i<N;i++) {
                    for(int j=0;j<N;j++) {
                        if(N==5*i+3*j){
                            a=i;b=j;count++;
                            break;
                        }
                    }
                }
                if(count==0){
                    System.out.println(-1);
                }
                else{
                    System.out.println(a+b);
                }
            }
        }