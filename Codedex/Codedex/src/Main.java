import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?");
        System.out.println("Enter your answer: ");

        String answer = scanner.nextLine();
        System.out.println(answer);
    }
}
