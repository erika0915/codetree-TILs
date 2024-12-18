import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i =0; i<n; i++){
            array[i]=sc.nextInt();
        }

        // 버블 정렬
        for(int i =0; i<n-1; i++){
            for(int j =0; j<n-1-i; j++){
                if(array[j] < array[j+1]){
                    int temp= array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        System.out.println(array[0] + " " + array[1]);
    }
}