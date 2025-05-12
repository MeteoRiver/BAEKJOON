import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i =0; i<commands.length; i++){
            int a = commands[i][1]-commands[i][0]+1;
            int[] arr=new int[a];
            int b = commands[i][0]-1;
            for(int j=0; j<a; j++){
                arr[j] = array[b++];
            }
            Arrays.sort(arr);
            answer[i]=arr[commands[i][2]-1];
        }
        
        
        return answer;
    }
}