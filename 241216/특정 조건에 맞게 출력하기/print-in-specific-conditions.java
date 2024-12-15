import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] array = new int[100];
        int index = 0;
        
        while(index < 100){
            int input= sc.nextInt();
            if(input==0){
                break;
            }

            array[index]= input;

            if(array[index]%2==0){
                array[index] = array[index]/2;
            }else{
                array[index] = array[index]+3;
            }

            index++;
        }
        
        for(int i= 0; i <index; i++){
            System.out.print(array[i] + " ");
        }
    }
}