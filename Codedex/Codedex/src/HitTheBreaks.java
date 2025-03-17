public class HitTheBreaks {
    public static void main(String[] args) {

        for(int i = 1; i<=10; i++){
            System.out.println("current i: " + i);

            if(i%2 == 0 && i%3 == 0){
                System.out.println("i found");
                break;
            }

        }


    }
}
