import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

class Solution {
    public int solution(String[][] clothes) {

        int rowCount = clothes.length;
        int count = 0;
        int answer = 1;
        /*[[옷,종류],[옷, 종류]]
            종류 당 옷 갯수*종류 당 옷 갯수
         중복되는 종류 빼고 -> 해시맵으로 옷의 총 갯수는 확인 가능한가.....
        */
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < rowCount; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }

        Iterator<Integer> iterator = map.values().iterator();

        while(iterator.hasNext()) {
            answer*=iterator.next().intValue() +1;
        }

        return answer-1;
    }
}