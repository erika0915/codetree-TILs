import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum1 = 0;
        int sum2 = 0;
        double avg = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 1; i <11; i+=2){
            sum1 += arr[i];
        }
        for(int i = 2; i<11; i+=3){
            sum2 += arr[i];
        }
        avg=(double)sum2/3;
        System.out.print(sum1+" ");
        System.out.printf("%.1f", avg);
    }
}