import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        if(a>=90&&a<=100){
            System.out.println("A");
        }
        else if (a<=89&&a>=80) {
            System.out.println("B");
        }
        else if (a<=79&&a>=70) {
            System.out.println("C");
        }
        else if (a<=69&&a>=60) {
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}