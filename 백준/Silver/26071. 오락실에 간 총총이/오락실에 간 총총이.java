import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[][] arr = new char[N][N];
		int max = -1;
		int mix = 1501;
		int may = -1;
		int miy = 1501;
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			for(int j = 0; j < N; j++) {
				if(str.charAt(j) == 'G') {
					mix = Math.min(mix, i);
					max = Math.max(max, i);
					may = Math.max(may, j);
					miy = Math.min(miy, j);
				}
			}
		}
		if(mix == max && may == miy)
			System.out.println(0);
		else if(mix == max){
			int ans = Math.min(may, N-miy-1);
			System.out.println(ans);
		}
		else if(may == miy) {
			int ans = Math.min(max, N-mix-1);
			System.out.println(ans);
		}
		else {
			int ax = Math.min(max, N-mix-1);
			int ay = Math.min(may, N-miy-1);
			System.out.println(ax+ay);
		}
	}
}