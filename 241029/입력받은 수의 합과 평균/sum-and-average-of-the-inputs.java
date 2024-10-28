import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int cnt = 0;
        double avg = 0;

        for(int i = 1; i<=n; i++){
            int a = sc.nextInt();
            sum+=a;
            cnt++;
        }
        avg = (double)sum/cnt;
        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);
    }
}