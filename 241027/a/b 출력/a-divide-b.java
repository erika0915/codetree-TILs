import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a % b; // 나머지 
        int d; // 몫 
        System.out.print(a/b+".");

        for (int i = 1; i<21; i++){     
            c *= 10; // 나머지에 10을 곱함. 
            d = c / b; // 나머지에 10을 곱한 다음에 b로 나누었을 때의 몫 = d
            c %= b;
            System.out.print(d);
        }
    }
}