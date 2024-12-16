import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 첫 번째와 두 번째 항 입력 받기 
        int first = sc.nextInt();
        int second = sc.nextInt();

        // count는 2부터 시작함 
        int count = 2;

        // 첫 번째, 두 번째 항 출력 
        System.out.print(first + " " + second);

        while(count<10){
            int nextTerm = 2 * first + second; 
            System.out.print(" " + nextTerm);
            
            first = second;
            second = nextTerm;
            
            count++;
        }
    }
}