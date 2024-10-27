import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char as = sc.next().charAt(0);
        int at = sc.nextInt();
        char bs = sc.next().charAt(0);
        int bt = sc.nextInt();
        char cs = sc.next().charAt(0);
        int ct = sc.nextInt();

        if (as=='Y'&& at>=37){
            if((bs=='Y' && bt >=37) || (cs=='Y' && ct>=37) ) {
                System.out.print("E");
            } 
            else 
                System.out.print("N");
        }
        else if (bs=='Y' && bt >=37){
            if((as=='Y' && at >=37) || (cs=='Y' && ct>=37) ) {
                System.out.print("E");
            } 
            else 
                System.out.print("N");
        }
        else if(cs=='Y' && ct>=37){
            if((as=='Y' && at >=37) || (bs=='Y' && bt>=37) ) {
                System.out.print("E");
            } 
            else 
                System.out.print("N");
        }
        else
            System.out.print("N");
    }
}