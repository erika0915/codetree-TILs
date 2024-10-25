import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        double d = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.print(s + "\n");
        System.out.printf("%.2f\n", d);
        System.out.printf("%.2f", c);
    }
}