import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int cnt = 0;
        
        while(true){
            if (n%2==0){
                cnt++;
                n*=3;
                n+=1;
            }
            else{
                cnt++;
                n*=2;
                n+=2;
            }

            if(n>=1000)
                break;
        }
        System.out.print(cnt);
    }
}