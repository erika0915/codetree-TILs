import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int count=0;

        for(int i = 0; i< 10; i++){
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                break;
            }
            else{
                count++;
            }
        }

        for(int i = 0; i <count; i++){
            System.out.print(arr[count-1-i] + " ");
        }
    }
}