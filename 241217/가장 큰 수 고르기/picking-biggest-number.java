import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int INT_MIN = Integer.MIN_VALUE;
        int maxVal = INT_MIN;

        int[] array = new int[10];
        for(int i = 0; i< 10; i++){
            array[i]= sc.nextInt();
            if(maxVal< array[i]){
                maxVal = array[i];
            }
        }
        System.out.println(maxVal);
    }
}