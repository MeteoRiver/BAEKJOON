class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int tmp=0;
        int prev=0;

        for(int i = 0; i<dartResult.length(); i++) {
        char c = dartResult.charAt(i);
        if(Character.isDigit(c)){
            if(i+1<dartResult.length()&&dartResult.charAt(i)=='1'&&dartResult.charAt(i+1)=='0'){
                if(i>0) {
                    prev=tmp;
                    answer += tmp;
                }
                tmp=10;
                i++;
            }
            else{
                prev=tmp;
                answer += tmp;
                tmp = c - '0';
            }
        }

        else if(c=='S'){
            tmp=(int) Math.pow(tmp,1);
        }
        else if(c=='D'){
            tmp=(int) Math.pow(tmp,2);
        }
        else if(c=='T'){
            tmp=(int) Math.pow(tmp,3);
        }
        else if(c=='*'){
            tmp*=2;
            answer+=prev;
            prev*=2;
        }
        else if(c=='#'){
            tmp*=-1;
        }
        }
        answer += tmp;
        return answer;
    }
}
