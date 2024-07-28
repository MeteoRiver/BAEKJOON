import java.util.*;

class Solution {
    private List<int[]> ansList;

    public int[][] solution(int n) {

        ansList = new ArrayList<>();
        game(n, 1,3, 2);

        int[][] answer = new int[ansList.size()][];
        for(int i=0; i<ansList.size(); i++){
            answer[i] = ansList.get(i);
        }
        return answer;
    }

    private void game(int n, int start, int end, int mid) {
        if(n == 1){
            ansList.add(new int[]{start, end});
            return;
        }
        game(n-1, start, mid, end);
        ansList.add(new int[]{start, end});
        game(n-1, mid, end, start);
    }
}