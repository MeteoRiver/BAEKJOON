class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                a++;
            } else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                b++;
            }
        }
        if (a == 0 && b == 0) {
            answer = true;
        } else if (a != b) {
            answer = false;
        }
        else if(a==b){
            answer = true;
        }
        return answer;
    }
}