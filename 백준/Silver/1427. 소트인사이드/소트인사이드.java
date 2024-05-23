import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder st=new StringBuilder(br.readLine());

        int n=st.length();
        int[] arr=new int[n];
        for(int i = 0; i < n; i++) {
            arr[i]= st.charAt(i)-'0';
        }
        Mergesort(arr);
        for(int i = n-1; i >= 0; i--){
            bw.write(arr[i]+'0');

        }
        bw.flush();
        bw.close();
    }

    public static void Mergesort(int[] arr) {
        int[] tmpArr = new int[arr.length];
        mergeSort(arr,tmpArr,0,arr.length-1);
    }
    public static void mergeSort(int[] arr, int[] tmpArr, int left, int right) {
        if (left < right) {
            int m = left + (right - left) / 2;
            mergeSort(arr, tmpArr, left, m);
            mergeSort(arr, tmpArr, m + 1, right);
            merge(arr, tmpArr, left, m, right);
        }
    }
    public static void merge(int[] arr, int[] tmpArr, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            tmpArr[i] = arr[i];
        }
        int part1 = left;
        int part2 = mid + 1;
        int index = left;
        while (part1 <= mid && part2 <= right) {
            if (tmpArr[part1] <= tmpArr[part2]) {
                arr[index] = tmpArr[part1];
                part1++;
            } else {
                arr[index] = tmpArr[part2];
                part2++;
            }
            index++;
        }
        for (int i = 0; i <= mid - part1; i++) {
            arr[index + i] = tmpArr[part1 + i];
        }
    }
}
