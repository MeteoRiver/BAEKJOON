    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.*;

    public class Main {

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            HashMap<Integer, Integer> map = new HashMap<>();
            int a = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i =0; i<a;i++){
                map.put(Integer.parseInt(st.nextToken()), i);
            }
            int b = Integer.parseInt(br.readLine());
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for(int i =0; i<b;i++){
                if(map.containsKey(Integer.parseInt(st1.nextToken()))){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }

        }
    }