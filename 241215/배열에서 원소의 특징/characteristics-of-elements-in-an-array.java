import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        for(int i =0 ; i < 10; i++){
            array[i] = sc.nextInt();
            if(array[i]%3==0){
                System.out.println(array[i-1]);
                break;
            }
        }
    }
}