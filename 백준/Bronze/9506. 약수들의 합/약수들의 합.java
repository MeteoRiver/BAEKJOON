import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int a=Integer.parseInt(br.readLine());
            int b=0;
            int count=0;
            if(a==-1){break;}
            int[] c=new int[a];
            for(int i=1;i<a;i++){
                if(a%i==0){
                    b+=i;
                    c[count]=i;
                    count++;
                }
            }
            if(b==a){
                System.out.print(a+" = ");
                for(int j=0;j<c.length;j++) {

                    System.out.print(c[j]);
                    if(c[j+1]==0){break;}
                    System.out.print(" + ");
                }
            }
            else{
                System.out.print(a+" is NOT perfect.");
            }
            System.out.println();
        }
    }
}