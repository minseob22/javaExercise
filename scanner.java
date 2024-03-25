import java.util.Scanner;
public class EggBasket{
    public static void main(String[] args)
    {int numberOfBasket, eggsPerBasket, totalEggs;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the unmber of eggs : ");
        eggsPerBasket = keyboard.nextInt();
        System.out.println("Enter the number of basket : ");
        numberOfBasket = keyboard.nextInt();

        totalEggs = numberOfBasket * eggsPerBasket;
        System.out.println(totalEggs);
    }
}