import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int count=0; 
        int[] array = new int[n];
        int[] countArray = new int[n];

        for(int i= 0; i<n; i++){
            array[i] = sc.nextInt();
            if(array[i]==2){
                count++;
            }
            if(count==3){
                System.out.println(i+1);
                break;
            }
        }
    }
}