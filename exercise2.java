import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("(2e-11 ~ 2e11) 실수를 입력해주세요 : ");
        
        double x = keyboard.nextDouble();
        int y = (int)x;
        byte z = (byte)x;

        System.out.println("x의 값 : "+ x);
        System.out.println("y의 값 : "+ y);
        System.out.println("z의 값 : "+ z);
        

        keyboard.close();
    }
}