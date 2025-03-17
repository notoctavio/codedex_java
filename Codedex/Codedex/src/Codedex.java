import java.util.Scanner;

public class Codedex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of coins: ");
        double coins = input.nextDouble();
        double coinValue = 0.0045;
        double money = 0.0045*coins;
        System.out.println("The amount of " + coins + " coins is " + money + "USD");
    }
}

