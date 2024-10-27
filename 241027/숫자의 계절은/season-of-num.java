import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>2 && n<6)
            System.out.print("Spring");
        else if (n>5 && n<9)
            System.out.print("Summer");
        else if (n>8 && n<12)
            System.out.print("Fall");
        else 
            System.out.print("Winter");
    }
}