import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>= b && a >=c){
            System.out.print(a);
        }
        else if (b >= c && b >=a){
            System.out.print(b);
        }
        else if (c >= b && c>=a){
            System.out.print(c);
        }
    }
}