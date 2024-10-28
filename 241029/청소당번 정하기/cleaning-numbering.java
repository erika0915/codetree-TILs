import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 1; i<=n; i++){
            
            if(i%2==0){
                cnt++;
            }
            if(i%3==0){
                cnt1++;
            }
            if(i%2==0 && i%3==0){
                cnt--;
                cnt1--;
            }
            if(i%6==0){
                cnt1++;
            }
            if(i%2==0 && i%12==0){
                cnt--;
                cnt2--;
            }
            if(i%12==0){
                cnt2++;
            }
            if(i%3==0 && i%12==0){
                cnt1--;
                cnt2--;
            }
            if(i%2==0 && i%3==0 && i%12==0){
                cnt--;
                cnt1--;
                cnt2--;
            }
            if(i%24==0){
                cnt2++;
            } 
        }
        System.out.print(cnt + " " + cnt1 + " " + cnt2);
    }
}