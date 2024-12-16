import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] charArray = new char[3];
        int[] intArray = new int[3];
        int[] count = new int[4];

        for(int i =0; i<3; i++){
            charArray[i]= sc.next().charAt(0);  
            intArray[i]= sc.nextInt();
        }

        for(int i =0; i<3; i++){
            if(charArray[i]=='Y' && intArray[i]>=37){
                count[0]++;
            }
            else if(charArray[i]=='Y' && intArray[i]<37){
                count[2]++;
            }
            else if(charArray[i]=='N' && intArray[i] >=37){
                count[1]++;
            }
            else{
                count[3]++;
            }
        }

        System.out.print(count[0] + " " + count[1] + " " + count[2]+ " " + count[3] + " ");
        if(count[0] >=2){
            System.out.print('E');
        }
    }
}