
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                double max= 0;
                double [] array= new double[n];
                for (int i = 0; i < n; i++) {
                    array[i] = scanner.nextInt();
                    if(array[i]>max){
                        max=array[i];
                    }
                }
                double a = 0;
                for (int j = 0; j < n; j++) {
                    array[j]=(array[j]/max)*100;
                    a+=array[j];
                }
                System.out.print(a/n);
            }
        }