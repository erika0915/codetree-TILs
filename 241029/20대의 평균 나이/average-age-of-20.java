import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double avg = 0;
        int cnt = 0;

        while(true){
            int a = sc.nextInt();
            sum+=a;
            cnt++;

            if(a>=30 || a<=10){
                cnt--;
                sum-=a;
                break;
            }
        }
        avg = (double)sum/cnt;
        System.out.printf("%.2f", avg);
    }
}