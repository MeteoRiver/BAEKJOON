class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        String reverse = new StringBuilder(s).reverse().toString();
        int[] answer = new int[reverse.length()];
        for (int i = 0; i < reverse.length(); i++) {
            answer[i] = reverse.charAt(i) - '0';
        }
        return answer;
    }
}