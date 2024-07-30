import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int count = 0;
        int[] copy = new int[progresses.length];
        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            if((100 - progresses[i]) % speeds[i] == 0) {
                copy[i] = (100 - progresses[i]) / speeds[i];
            }
            else {
                copy[i] = ((100 - progresses[i]) / speeds[i]) + 1;
            }
            q.add(copy[i]);
        }

        int num = q.peek();

        while(!q.isEmpty()) {
            if(q.peek()<=num) {
                q.poll();
                count++;
            }
            else {
                list.add(count);
                count=1;
                num = q.poll();
            }
        }
        list.add(count);

        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;

    }
}