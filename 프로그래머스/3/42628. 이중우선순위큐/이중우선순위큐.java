import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(String[] operations) {

        int[] answer = new int[2];

        //우선순위 큐에
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        PriorityQueue<Integer> repq = new PriorityQueue<Integer>(Collections.reverseOrder());


        for(int i = 0; i < operations.length; i++){
            if(operations[i].contains("I")){
                //숫자 큐에 주어진 숫자 삽입
                repq.add(Integer.parseInt(operations[i].substring(1).trim()));
                pq.add(Integer.parseInt(operations[i].substring(1).trim()));
            }
            else if(operations[i].contains("D 1")){
                //최댓값 삭제
                pq.remove(repq.poll());
            }
            else if(operations[i].contains("D -1")){
                //최솟값 삭제
                repq.remove(pq.poll());
            }
        }
        if(pq.isEmpty()||repq.isEmpty()){
            answer[0] = 0;
            answer[1] = 0;
        }
        else{
            answer[0] = repq.peek();
            answer[1] = pq.peek();
        }
        return answer;
    }
}