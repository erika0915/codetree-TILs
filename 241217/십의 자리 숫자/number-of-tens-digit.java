import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int[] array= new int[100];
        int[] countArray = new int[10];
        int i=0;

        while(true){
            array[i] = sc.nextInt();
            if(array[i]==0){
                break;
            }
            i++;
        }

        for(int j =0; j<i; j++){
            countArray[array[j]/10]++;
        }

        for(int k =1; k<10; k++){
            System.out.println(k + " - " + countArray[k]);
        }
    }
}