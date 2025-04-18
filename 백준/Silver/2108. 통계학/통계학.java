import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(bf.readLine());
            arr[i] = m;
            map.put(m, map.getOrDefault(m, 0) + 1);
        }

        Arrays.sort(arr);

        // 1. 산술평균
        double sum = 0;
        for (int num : arr) sum += num;
        int a = (int) Math.round(sum / n);

        // 2. 중앙값
        int b = arr[n / 2];

        // 3. 최빈값
        List<Integer> modeList = new ArrayList<>();
        int maxFreq = Collections.max(map.values());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modeList.add(entry.getKey());
            }
        }
        Collections.sort(modeList);
        int c = (modeList.size() > 1) ? modeList.get(1) : modeList.get(0); 

        // 4. 범위
        int d = arr[n - 1] - arr[0];

        // 출력
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
