import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a_math = sc.nextInt();
        int a_eng = sc.nextInt();
        int b_math = sc.nextInt();
        int b_eng = sc.nextInt();

        if(a_math < b_math)
            System.out.print("B");
        else if(a_math > b_math)
            System.out.print("A");

        if (a_math == b_math){
            if (a_eng > b_eng){
                System.out.print("A");
            } else {
                System.out.print("B");
            }
        }
    }
}