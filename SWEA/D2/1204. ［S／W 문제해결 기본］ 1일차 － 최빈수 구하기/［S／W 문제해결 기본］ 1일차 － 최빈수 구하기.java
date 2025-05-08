import java.util.*;
import java.io.*;

class Solution
{
	    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[101];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 1000; j++) {
                arr[Integer.parseInt(st.nextToken())]++;
            }
            int max=0;
            int count=0;
            for(int j = 0; j < 101; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                    count = j;
                }
                else if (arr[j] == max && j > count) {
                    count = j;
                }

            }
        System.out.print("#"+n+" ");
        System.out.println(count);

        }

    }
}