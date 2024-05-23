import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int count=0;
        int b=0;
//arr 배열은 26칸짜리 각 칸마다 알파벳 자리수
        int[] arr = new int[26];
        for (int i=0;i<a;i++){
            for(int k=0;k<arr.length;k++)
            {//arr 전부 0으로 초기화
                arr[k]=0;}
            int pre = -1;//하나전거
            int in = 0;//지금거
            //s 문자열은 입력받은 문자열
            String s = br.readLine();
            for(int j=0;j<s.length();j++) {
                in = s.charAt(j) - 'a';
                if (pre != in) {//이전과 다르다
                    if (arr[in] == 0) {//처음이다
                        arr[in] = 1;
                    } else {// 처음 나온 수가 아니다
                        count = 1;
                    }
                }
                pre = in;

            }
             b+=count;
            count=0;
        }
        System.out.print(a-b);
    }
}