import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Deque<int[]> deque = new ArrayDeque<>();
        for (int i = 0; i < priorities.length; i++) {
            deque.addLast(new int[]{i, priorities[i]});
        }

        int printOrder = 0;

        while (!deque.isEmpty()) {
            int[] front = deque.pollFirst();
            boolean hasHigher = false;

            for (int[] doc : deque) {
                if (doc[1] > front[1]) {
                    hasHigher = true;
                    break;
                }
            }

            if (hasHigher) {
                deque.addLast(front);
            } else {
                printOrder++;
                if (front[0] == location) {
                    return printOrder;
                }
            }
        }

        return -1;
    }
}