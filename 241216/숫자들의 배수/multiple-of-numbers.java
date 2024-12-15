import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] array = new int[100];
        int count = 0;
        int index = 0;

        for(int i=1; count<2; i++){
            int current = num * i;
            array[index++]=current;

            if(current%5==0){
                count++;
            }
        }
        
        for(int i= 0; i <index; i++){
            System.out.print(array[i] + " ");
        }
    }
}