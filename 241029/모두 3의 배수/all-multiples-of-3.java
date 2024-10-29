import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        boolean result = true;

        for(int i =1; i<= 5; i++){
            int n = sc.nextInt();

            if(n%3!=0){
                result = false;
                break;
            }
        }
        
        if(result == false){
            System.out.print(0);
        }
        else 
            System.out.print(1);
    }
}