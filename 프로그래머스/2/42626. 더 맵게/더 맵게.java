import java.util.*;

    class Solution {
        public int solution(int[] scoville, int K) {
            int answer = 0;
            int first = 0;
            int second = 0;
            int num =0;
            PriorityQueue<Integer> q = new PriorityQueue<>();

            Arrays.sort(scoville);

            for(int i =0; i<scoville.length; i++){
                q.add(scoville[i]);
            }

            while(q.peek() < K){
                if(q.size() < 2)
                {
                    return -1;
                }
                else{
                 first = q.poll();
                 second = q.poll();
                 num = first + (second * 2);
                 q.offer(num);
                 answer += 1;
                }
            }
            return answer;
        }
    }