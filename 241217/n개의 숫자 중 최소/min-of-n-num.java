import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        final int INT_MAX = Integer.MAX_VALUE;
        int minVal = INT_MAX;
        int[] array = new int[n];

        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
            if(minVal>array[i]){
                minVal=array[i];
            }
        }
        
        int count = 0;
        for(int i =0; i<n; i++){
            if(array[i]==minVal){
                count++;
            }
        }

        System.out.print(minVal + " " + count);
    }
}