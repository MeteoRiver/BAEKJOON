import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int idx=0;
        Arrays.sort(people);
        for(int i = people.length-1; i >=0; i--){
            if(people[i]+people[idx] > limit){
                answer++;
            }
            else{
                idx++;
                answer++;
            }
            if(idx >= i){break;}
        }

        return answer;
    }
}