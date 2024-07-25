import java.util.StringTokenizer;

public class Solution {
    public  String solution(String s) {
        StringBuilder sb =  new StringBuilder();
        s=s.toLowerCase();
        StringTokenizer st = new StringTokenizer(s, " ", true);
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            if(str.equals(" ")){
                sb.append(str);
            }else{
                String upper = str.substring(0, 1).toUpperCase();
                String lower = str.substring(1);
                sb.append(upper).append(lower);
            }
        }
        String answer = sb.toString();
        return answer;
    }
}