
import java.util.Scanner;
        public class Main{
            public static void main(String[] args)  {
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                String a = scanner.nextLine();
                a = scanner.nextLine();
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    char b = a.charAt(i);
                    sum += Integer.parseInt(String.valueOf(b));
                }
                System.out.println(sum);
            }
        }
