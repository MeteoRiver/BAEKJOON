import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());
            if(a==0 && b==0 && c==0){
                break;
            }
            if(a>b && a>c){
                if(a*a==b*b+c*c){
                    System.out.println("right");
                }
                else{
                    System.out.println("wrong");
                }
            }
            else if(b>a && b>c){
                if(b*b==a*a+c*c){
                    System.out.println("right");
                }
                else{
                    System.out.println("wrong");
                }
            }
            else if(c>b && c>a){
                if(c*c==a*a+b*b){
                    System.out.println("right");
                }
                else{
                    System.out.println("wrong");
                }
            }
            else{
                System.out.println("wrong");
            }
        }
    }
}