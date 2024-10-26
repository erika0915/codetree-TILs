import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch == 'S')
            System.out.print("Superior");
        else if(ch == 'A')
            System.out.print("Excellent");
        else if(ch == 'B')
            System.out.print("Good");
        else if(ch == 'C')
            System.out.print("Usually");
        else if(ch == 'D')
            System.out.print("Effort");
        else    
            System.out.print("Failure");
    }
}