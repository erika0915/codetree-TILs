import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];

        for (int i= 0; i < num; i++){
            array[i] = sc.nextInt();
            System.out.print(array[i]*array[i]+ " ");
        }
    }
}