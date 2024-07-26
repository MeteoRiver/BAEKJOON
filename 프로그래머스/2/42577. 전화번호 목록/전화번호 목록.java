import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        int n = phone_book.length;
        boolean answer = true;

        for (int i = 0; i < n-1; i++) {
            StringBuilder sb = new StringBuilder(phone_book[i]);
            if (phone_book[i + 1].startsWith(sb.toString())) {
                return false;
            }
        }
        return true;
    }
}