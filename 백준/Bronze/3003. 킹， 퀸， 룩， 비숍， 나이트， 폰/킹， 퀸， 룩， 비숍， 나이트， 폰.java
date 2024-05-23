import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr= {1,1,2,2,2,8};
        int[] input= new int[6];
        for(int i=0;i<6;i++){
            input[i]=scanner.nextInt();
            System.out.print(arr[i]-input[i]+" ");
        }

    }
}