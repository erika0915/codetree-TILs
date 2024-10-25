import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        String first = sc.next();
        String yyyy = sc.next();
        String xxxx = sc.next();

        System.out.print(first + "-" + xxxx + "-" + yyyy);
    }
}