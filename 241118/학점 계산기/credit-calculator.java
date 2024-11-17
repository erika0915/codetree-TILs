import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int learn = sc.nextInt();
        double[] score = new double[learn];
        double sum =0;
        double avg =0;
        for(int i = 0; i<learn; i++){
            score[i] = sc.nextDouble();
            sum+=score[i];
        }
        avg=(double)sum/learn;
        System.out.printf("%.1f", avg);
        System.out.println();

        if(avg>=4.0){
            System.out.println("Perfect");
        }else if(avg>=3.0){
            System.out.println("Good");
        }else{
            System.out.println("Poor");
        }
    }
}