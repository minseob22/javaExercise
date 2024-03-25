import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("(2e-11 ~ 2e11) 실수를 입력해주세요 : ");
        
        double x = keyboard.nextDouble();
        double y = 1.0/x;

        System.out.println("x = "+ x);
        System.out.println("y = "+ y);
        System.out.println("x * y = "+ (x * y));
        System.out.println("x * y -1 = "+ (x*y-1.0));
        

        keyboard.close();
    }
}
