import javax.sound.sampled.Line;
import javax.swing.text.html.Option;
import java.util.Scanner;


/*
Some things I think I could add to this is:
    - a way to give the cat accessories
    - animation? (probably too hard)
    - maybe use JFrame and make it into an actual program with pictures. (really hard)
    - random stats for every time you play?
    - boxes around the statements.
    - multiple cats!!!
 */

public class Main {
    public static void main(String[] args) {
        //myCat includes the name and color of cat and lets user set it from CatCreation()
        Cat myCat = CatCreation();
        System.out.println(myCat.getCatName());
        Scanner console = new Scanner(System.in);

        CatWellBeing CatStats = new CatWellBeing();

        Options(console, CatStats, myCat);
        }

        public static Cat CatCreation(){
            Introduction();
            Scanner userCatInput = new Scanner(System.in);

            System.out.println("What is your cat's name?");
            String catName = userCatInput.nextLine();
            System.out.println("Your new cat name is " + catName);

            System.out.println("What is the color of your cat?");
            String catColor = userCatInput.nextLine();
            System.out.println("Awesome! Your new cat's color is " + catColor + "\n");

            return new Cat(catName, catColor);

        }

        public static void Introduction(){
            line();
            System.out.println("Welcome to the super cool Pet Cat Game!");
            System.out.println("You are now a new cat owner :) ");
            System.out.println("Let's setup your cats name and color!");
            CatPicture1();
            line();
        }

        public static void Options(Scanner sc, CatWellBeing CatStats, Cat myCat){
        // asking the user what choice they want to make.

            //String getCatName = myCat.getCatName();

            System.out.println("What would you like to do?");
            System.out.println("(a) Start!");
            System.out.println("(b) View Stats");
            System.out.println("(c) Pet Cat");
            System.out.println("(d) Feed Cat");
            System.out.println("(e) Rename Cat!");
            System.out.println("(f) Exit" + "\n");
            String choice = sc.nextLine();

            switch(choice){
                case "a":
                    System.out.println("You have chosen \" Start! \" ");
                    //CatProgram(sc, CatStats);
                    break;
                case "b":
                    System.out.println("You have chosen \" View Stats\" ");
                    ViewStats(sc, CatStats, myCat);
                    break;
                case "c":
                    System.out.println("You have chosen \" Pet Cat\" ");
                    PetCat(sc, CatStats, myCat);
                    break;
                case "d":
                    System.out.println("You have chosen \" Feed Cat\" ");
                    Cat.feed();
                    Options(sc, CatStats, myCat);
                    break;
                case "e":
                    System.out.println("You have chosen \" Rename Cat\" ");
                    changeCatName(myCat);
                    Options(sc, CatStats, myCat);
                    break;

                case "f":
                    System.out.println("You have chosen \" Exit\" ");
                    Exit();
                default:
                    System.out.println("You have not made a valid choice");
                    break;

            }



        }

        public static void changeCatName(Cat myCat){
            Scanner console = new Scanner(System.in);
            System.out.println("What do you want to set the cats name to?");
            String newCatName = console.nextLine();
            myCat.setCatName(newCatName);
            System.out.println("Your new cats name is " + myCat.getCatName());

        }
/*
For ViewStats, we could keep it and try to store data in a way that can be dynamically updated.
But also we could just make the game list out all the data after every stat change in a way?
Like what if at the end of a feed method it put out a list of your happiness, hunger, health, etc.
with how much it changed.
 */
        public static void ViewStats(Scanner sc, CatWellBeing CatStats, Cat myCat){
            // NEEDS WORK DESPERATELY!! , THE STATS IS OFF
            //System.out.println("Your cats name is " + name);
            System.out.println();
            System.out.println("Stats:");

            // listing stats from CatWellBeing class
            System.out.println("Hunger:" + CatStats.hunger );
            System.out.println("Happiness:" + CatStats.happiness );
            System.out.println("Health:" + CatStats.health );
            System.out.println();
            Options(sc, CatStats, myCat);
        }

        public static void Exit(){
            System.out.println("Goodbye!");
            System.exit(0);
        }

        public static void PetCat(Scanner sc, CatWellBeing CatStats, Cat myCat){
            String getCatName = myCat.getCatName();
            System.out.println(getCatName + " appreciates your pets!");
            CatPicture2();
            Options(sc, CatStats, myCat);
        }
// kind of want to move these two into an object maybe? and I could add more cats there.
        public static void CatPicture1(){
            System.out.println("      \\    /\\");
            System.out.println("       )  ( ')");
            System.out.println("      (  /  )");
            System.out.println("       \\(__)|");
        }

        public static void CatPicture2(){
            System.out.println("    /\\_/\\           ___");
            System.out.println("   = o_o =_______    \\ \\ ");
            System.out.println("    __^      __(  \\.__) )");
            System.out.println("   <_____>__(_____)____/");
        }

        public static void line(){
            System.out.println("***************************************");
        }
    }