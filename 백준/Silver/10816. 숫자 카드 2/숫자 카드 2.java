    import java.io.*;
    import java.util.*;
    
    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[] arr1 = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr1);
    
            int m = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                int a= Integer.parseInt(st1.nextToken());
                int b=upperBound(arr1,a)-lowerBound(arr1,a);
                sb.append(b).append(" ");
            }
            System.out.println(sb);
        }
    
        public static int lowerBound(int[] array, int value) {
            int low = 0;
            int high = array.length;
            while (low < high) {
                int mid = low + (high - low) / 2;
                if (value <= array[mid]) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
            return low;
        }
    
        public static int upperBound(int[] array, int value) {
            int low = 0;
            int high = array.length;
            while (low < high) {
                int mid = low + (high - low) / 2;
                if (value >= array[mid]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
    }
