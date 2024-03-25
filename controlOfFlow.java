import java.util.Scanner;
public class controlOfFlow {

    public static void main(String[] args) {
        
    
    String s1, s2;
    System.out.println("Enter two lines of text");
    Scanner keyboard = new Scanner(System.in);
    s1 = keyboard.nextLine();
    s2 = keyboard.nextLine();

    if(s1.equals(s2))
        System.out.println("The two line is equal.");
    else System.out.println("The two line is not equal.");

    if(s2.equals(s1))
    System.out.println("The two line is equal.");
    else System.out.println("The two line is not equal.");

    if(s2.equalsIgnoreCase(s1))
    System.out.println("The two line is equal.");
    else System.out.println("The two line is not equal.");


    }
}
