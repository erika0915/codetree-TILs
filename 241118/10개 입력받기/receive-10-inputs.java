import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        double avg = 0;
        int count = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                break;
            }
            else{
                sum+=arr[i];
                count++;
            }
        }

        avg = (double)sum/count;
        System.out.print(sum+" ");
        System.out.printf("%.1f", avg);
    }
}