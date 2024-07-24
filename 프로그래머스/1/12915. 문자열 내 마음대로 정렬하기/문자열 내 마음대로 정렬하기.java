import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<>();
        /*
        n에 해당하는 문자를 숫자로 바꿔서 숫자 크기로 비교해서 정렬
        숫자 크기가 같은 경우 해당 문자열의 다음 인덱스 문자 처음부터 비교
        ->리스트에 (문자열의 n번째 문자 + 문자열 배열) 전부 넣고 정렬
        ->리스트에 있는 문자열에서 1번째 문자 제외하고 추출하기
        */
        for(int i = 0; i< strings.length;i++){
            list.add(strings[i].charAt(n)+strings[i]);
        }
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }
        return answer;
    }
}