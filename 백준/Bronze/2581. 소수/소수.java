import java.io.*;

public class Main {
    public static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m=Integer.parseInt(br.readLine());
        int n=Integer.parseInt(br.readLine());
        int sum=0;
        int min=n;
        for(int i=m;i<=n;i++){
            if(i==1){continue;}
            fine_prime(i);
            if(prime[i]==false){
                sum+=i;
                if(i<min){min=i;}
            }
        }
        if(sum==0){
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static void fine_prime(int N){
        prime = new boolean[N+1];

        if(N<2){
            return;
        }
        prime[0]=prime[1]=true;

        for(int i=2;i<=Math.sqrt(N);i++){
            if(prime[i]==true){
                continue;
            }
            for(int j=i*i;j<=N;j+=i){
                prime[j]=true;
            }
        }

    }
}
