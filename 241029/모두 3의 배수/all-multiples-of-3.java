import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        while(true){
            int n = sc.nextInt();

            for (int i =1; i<= 5; i++){
                if(n % 3 == 0){
                    cnt++;
                }
            }

            if(cnt ==5){
                System.out.print(1);
                break;
            }
            else 
                System.out.print(0);
                break;
        }
        
    }
}