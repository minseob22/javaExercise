
import java.util.Scanner;


public class grader {
    public static void main(String[] args) {
        int score;
        char grade;
        System.out.println("Enter the your Score : ");
        Scanner keyboard = new Scanner(System.in);
        score = keyboard.nextInt();

        if(score>=90)
            grade = 'A';           
        else if(score>=80)
            grade = 'B';
        else if(score>=70)
        grade = 'C';
        else if(score>=60)
        grade = 'D';
        else grade = 'F';

        System.out.println(grade);
    }
}
