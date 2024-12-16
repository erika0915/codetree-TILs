import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] countArray = new int[10];

        for(int i = 0; i <n ; i ++){
            array[i]=sc.nextInt();
        }

        for (int i = 0; i<n; i++){
            countArray[array[i]]++;
        }
        
        for(int i =1 ; i<10; i++){
            System.out.println(countArray[i]);
        }
    }
}