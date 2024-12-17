import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[100];
        int count=0;
        int i =0;

        while(true){
            array[i] = sc.nextInt();
            count++;
            if(array[i]==999 || array[i]==-999){
                break;
            }
            i++;
        }

        int minVal = 999;
        int maxVal = -999;
        for(int j =0; j<count-1; j++){
            if(minVal>array[j]){
                minVal=array[j];
            }
            if(maxVal<array[j]){
                maxVal=array[j];
            }
        }

        System.out.print(maxVal + " " + minVal);
    }
}