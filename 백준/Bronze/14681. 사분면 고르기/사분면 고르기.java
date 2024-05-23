import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if(x>0 && y>0){
            System.out.println("1");
        }
        else if(x>0 && y<0){
            System.out.println("4");
        }
        else if(x<0 && y>0){
            System.out.println("2");
        }
        else{
            System.out.println("3");
        }
    }
}