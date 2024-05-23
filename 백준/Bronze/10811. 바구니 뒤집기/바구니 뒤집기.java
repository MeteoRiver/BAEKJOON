
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int n=scanner.nextInt();
                int m=scanner.nextInt();
                int[] array=new int[n];
                for(int l=0;l<n;l++){
                    array[l]=l+1;
                }

                for(int a = 0; a<m;a++)
                {
                    int c=0;
                    int i=scanner.nextInt()-1;
                    int j=scanner.nextInt()-1;
                    for(int k = i; k<=j; k++)
                    {
                        if(j-c<=k){break;}
                        int temp=array[k];
                        array[k]=array[j];
                        array[j]=temp;
                        j--;

                    }
                }
                for(int b = 0; b<n; b++)
                {
                    System.out.print(array[b]+" ");
                }

            }
        }
