import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {

        String answer = "Yes";

        Queue<String> q1= new LinkedList<>();
        Queue<String> q2= new LinkedList<>();
        int n = cards1.length;
        int m = cards2.length;

        for(int i=0; i<n; i++){
            q1.offer(cards1[i]);
        }
        for(int i=0; i<m; i++){
            q2.offer(cards2[i]);
        }

        for(int i=0; i< goal.length; i++){
            if((!(q1.isEmpty()))&&goal[i].equals(q1.peek())){
                q1.poll();
                answer = "Yes";

            }
            else if((!(q2.isEmpty()))&&goal[i].equals(q2.peek())){
                q2.poll();
                answer = "Yes";
            }
            else{
                answer = "No";
                break;
            }
        }

        return answer;
    }
}
