public class Rollercoaster {
    public static void main(String[] args) {
        int minWeight = 40;
        int minHeight = 120;
        int currentWeight = 50;
        int currentHeight = 180;

        if (currentWeight  >= minWeight && currentHeight  >= minHeight) {
            System.out.println("Congrats! You can ride! \uD83C\uDFA2");

        }else{
            System.out.println("Sorry, You can't ride today. \uD83D\uDE1E");
        }
    }
}
