    import java.io.*;
    import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st1.nextToken()), b=Integer.parseInt(st1.nextToken());
            int c=Integer.parseInt(st2.nextToken()), d=Integer.parseInt(st2.nextToken());
            int x=Integer.parseInt(st3.nextToken()), y=Integer.parseInt(st3.nextToken());
            int m=0, n=0;
            if(a==c){
                m=x;
                if(b==d){
                    n=y;
                }
                else if(b==y){
                    n=d;
                }
                else{
                    n=b;
                }
            }
            else if(a==x){
                m=c;
                if(b==d){
                    n=y;
                }
                else if(b==y){
                    n=d;
                }
                else{
                    n=b;
                }
            }
            else{
                m=a;
                if(b==d){
                    n=y;
                }
                else if(b==y){
                    n=d;
                }
                else{
                    n=b;
                }
            }
            System.out.println(m+" "+n);

        }
    }