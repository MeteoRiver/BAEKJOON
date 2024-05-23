import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n= br.readLine();
        String [] arr={"c=","c-","dz=","d-","lj","nj","s=","z="};
        for(int i=0;i<arr.length;i++){
            if(n.contains(arr[i])){
                n=n.replace(arr[i],"A");
            }
        }

        System.out.println(n.length());

    }
}