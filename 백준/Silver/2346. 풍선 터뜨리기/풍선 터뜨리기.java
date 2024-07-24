import java.io.*;
import java.util.*;
//데크큐 한칸에 인덱스랑 숫자 포함 숫자 빼면서 인덱스 뽑아서 입력하게
//데크큐에서 양수이면 해당 수의 앞 수들을 모두 뒤에 추가하고
//음수이면 해당수의 뒷자리 수들을 모두 앞으로 추가해서 해당 수 추출하고 삭제하게 시도

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        ArrayDeque<int[]> d = new ArrayDeque<>();
        for(int i = 0; i < n; i++) {
            int[] nums = {i+1,Integer.parseInt(st.nextToken())};
            d.add(nums);
        }
        while(d.size()>1) {
            sb.append(d.peek()[0]);
            sb.append(" ");
            int movenum = d.peek()[1];
            d.pop();
            if (movenum > 0) {
                for (int i = 1; i < movenum; i++) {
                    d.offerLast(d.pollFirst());
                }
            } else {
                for (int i = 0; i > movenum; i--) {
                    d.offerFirst(d.pollLast());
                }
            }
        }
        sb.append(d.peek()[0]);
        System.out.println(sb);
    }
}
