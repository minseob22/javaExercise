import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("(2e-11 ~ 2e11) 실수를 입력해주세요 : ");
        
        double x = keyboard.nextDouble();
        double y = x % 2.0;
        int z = (int)x;

        System.out.println("x의 값 : "+ x);
        System.out.println("y의 값 : "+ y);
        System.out.println("z % 2.0 의 값 : "+ (z%2.0));
        

        keyboard.close();
    }
}