import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);

        // 해당 문자를 찾지 못했다면 -1 
        int idx = -1; 

        char[] array = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        
        // 문자 탐색 
        for(int i =0; i<6; i++){
            if(array[i]==input){
                idx = i;
            }
        }

        // 문자가 존재하지 않는 경우
        if (idx == -1) {
            System.out.println("None");
        }
        else {
            System.out.println(idx);
        }
    }
}