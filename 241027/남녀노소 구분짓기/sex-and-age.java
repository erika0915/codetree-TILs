import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == 0){
            if(b>=19){
                System.out.print("MAN");
            }
            else{
                System.out.print("BOY");
            }
        } 
        else {
            if(b>=19){
                System.out.print("WOMAN");
            }
            else{
                System.out.print("GIRL");
            }
        }
    }
}