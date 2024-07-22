import java.util.*;

class Solution {
    public static void main(String[] args){
        System.out.println(Arrays.toString(solution(3,2,5)));
        System.out.println(Arrays.toString(solution(4,7,14)));
                           
    }
    public static int[] solution(int n, long left, long right) {
        int count=0;
        int l = (int)right - (int)left+1;
        int[] answer = new int[l];
        /*left부터 right까지 1차원, 배열의 길이는 right-left+1
        배열 내용물 - (행,열) 중에 큰 값이 됨(인덱스(좌표)값 + 1)
        행 열 구하고 값 비교해서 배열에 넣기
        arr[00,10,20,...n0,01,11,...n1,...,nn]
        arr[left,left+1,...,right]
        */
        for(long i = left;i<right+1;i++){
            long row = (i/n)+1;
            long col = (i%n)+1;
            answer[count++]=(int)Math.max(row,col);
        }
        return answer;
    }
}