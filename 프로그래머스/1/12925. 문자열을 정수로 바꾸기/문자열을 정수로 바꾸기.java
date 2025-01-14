class Solution {
    public int solution(String s) {
        int answer = 0;
        if(s.charAt(0) == '-'){
            s=s.substring(1);
            answer = Integer.parseInt(s);
            answer = -answer;
        }
        else {
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}