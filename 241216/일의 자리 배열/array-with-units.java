import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.print(a + " " + b+ " ");

        for(int i = 3; i< 10; i++){
            int next = (a + b) % 10;
            a =b;
            b= next;
            System.out.print(next + " ");
        }
    }
}