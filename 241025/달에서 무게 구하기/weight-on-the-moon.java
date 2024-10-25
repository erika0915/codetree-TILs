public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int weight = 13;
        double gravity = 0.165;
        double result;
        result = weight * gravity;

        System.out.print(weight + " * " + gravity + " = ");
        System.out.printf("%.6f",result);
    }
}