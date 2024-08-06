import java.util.*;

class Solution {
    Set<String> set;
    String[] arr = {"A", "E", "I", "O", "U"};
    public int solution(String word) {
        int answer = 0;
        set = new TreeSet<>();

        for(int i = 0; i < 5; i++) {
            dfs(arr[i],i);
        }
        int count = 0;
        for( String str : set) {
            count++;
            if(str.equals(word)) {
                return count;
            }
        }
        return answer;
    }
    public void dfs(String word, int depth) {
        set.add(word);
        if(depth == 5){
            return;
        }
        for(int i=0; i<5;++i){
            dfs(word+arr[i], depth+1);
        }
    }
}