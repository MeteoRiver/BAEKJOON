import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].length() == arr[j].length()) {
                    if (arr[i].compareTo(arr[j]) > 0) {
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
                else if (arr[i].length() > arr[j].length()){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n-1; i++) {
            if(arr[i].equals(arr[i+1])) {
                continue;
            }

            bw.write(arr[i] + "\n");

        }
        bw.write(arr[n-1]);
        bw.flush();
    }
}
