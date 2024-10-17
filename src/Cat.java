import java.util.Scanner;

public class Cat {
    public static void Pet(int number){
        System.out.println("THE CAT APPRECIATES YOUR PETS :3");

    }

    public static void feed(){
        Scanner console2 = new Scanner(System.in);

        // food stats
        int catFood = 25;
        int tunaFish = 35;
        int catNip = -20;

        CatWellBeing CatStats = new CatWellBeing();

        System.out.println("You have chosen to feed your cat!");
        System.out.println("What would you like to feed your cat?");
        System.out.println("1. Cat Food");
        System.out.println("2. Tuna Fish");
        System.out.println("3. CatNip");

        String choice = console2.next();

        // if statement to decide what user chose to feed cat.
        if(choice.equals("1")){

            System.out.println("You have chosen to feed your cat Cat Food");
            System.out.println("STAT CHANGE! HUNGER: +" + catFood);
            int newHunger = CatWellBeing.modifyHunger(catFood);
            System.out.println("New Happiness is " + newHunger);

        }else if(choice.equals("2")){

            System.out.println("You have chosen to feed your cat Tuna Fish");
            System.out.println("STAT CHANGE! HUNGER: +" + tunaFish);
            int newHunger = CatWellBeing.modifyHunger(tunaFish);
            System.out.println("New Happiness is " + newHunger);

        }else if(choice.equals("3")){

            System.out.println("You have chosen to feed your cat Catnip");
            System.out.println("STAT CHANGE! HUNGER: +" + catNip);
            int newHunger = CatWellBeing.modifyHunger(catNip);
            System.out.println("New Happiness is " + newHunger);

        }else{
            System.out.println("AAAHHH THATS NOT A OPTION :( ");
        }
    }

    public static void play(Scanner console){
        int catString = 25;
        int ball = 40;
        int laserPointer = 70;


        System.out.println("What would you like to play your cat with?");

    }

    public static void Color(){
        System.out.println("Color");
    }




}
