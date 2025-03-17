public class CatOwner{
    public static void main(String[] args) {
        int ownCats = 0;
        int ownDogs = 1;
        boolean isCatOwner = ownCats >= 1;
        boolean isDogOwner = ownDogs >= 1;
        if (isCatOwner){
            System.out.println("Use the code MEOW for 20% off cat items.");
        }else if (isDogOwner){
            System.out.println("Use the code WOOF for 20% off dog items.");
        }else{
            System.out.println("Welcome to the pet store!");
        }
    }
}
