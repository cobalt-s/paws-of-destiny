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
        CatWellBeing CatStats = new CatWellBeing();
        Scanner console = new Scanner(System.in);

        Options(console, CatStats);
        }

        public static void CatProgram(Scanner console, CatWellBeing CatStats) {
            Introduction();
            CatIdentity(console);
            Options(console, CatStats);
        }

        public static void Introduction(){
            System.out.println("***************************************");
            System.out.println("Welcome to the super cool Pet Cat Game!");
            System.out.println("You are now a new cat owner :)");
            CatPicture1();
            System.out.println("***************************************");
        }
/*
For CatIdentity, I think it would be cool to make it as the starting method in the main method
because we could put it so the program remembers the name and color of the cat. And that could
add a lot of personalization to it.
 */
        public static void CatIdentity(Scanner sc){
            System.out.println("What is your cat's name?");
            String name = sc.nextLine();
            System.out.println("Your new cat name is " + name);
            System.out.println("What is the color of your cat?");
            String color = sc.nextLine();
            System.out.println("Awesome! Your new cat's color is " + color);
            System.out.println();
            System.out.println("Your new cat's name is " + name + " and its color is " + color);
            System.out.println();
        }

        public static void Options(Scanner sc, CatWellBeing CatStats){
        // asking the user what choice they want to make.
            System.out.println("What would you like to do?");
            System.out.println("(a) Start!");
            System.out.println("(b) View Stats");
            System.out.println("(c) Pet Cat");
            System.out.println("(d) Feed Cat");
            System.out.println("(e) Exit");
            System.out.println();
            String choice = sc.nextLine();

            // if statements for what choice user picked.
            if(choice.equalsIgnoreCase("a")){
                System.out.println("You have chosen \" Start! \" ");
                CatProgram(sc, CatStats);
            }else if (choice.equalsIgnoreCase("b")){
                System.out.println("You have chosen \" View Stats\" ");
                ViewStats(sc, CatStats);

            }else if (choice.equalsIgnoreCase("c")){
                System.out.println("You have chosen \" Pet Cat\" ");
                PetCat(sc, CatStats);

            }else if (choice.equalsIgnoreCase("d")){
                System.out.println("You have chosen \" Feed Cat \" ");
                Cat.feed();
                Options(sc, CatStats);
            }else if(choice.equalsIgnoreCase("e")){
                System.out.println("You have chosen \" Exit\" ");
                Exit();
            }else{
                System.out.println("ERROR");
            }
        }
/*
For ViewStats, we could keep it and try to store data in a way that can be dynamically updated.
But also we could just make the game list out all the data after every stat change in a way?
Like what if at the end of a feed method it put out a list of your happiness, hunger, health, etc.
with how much it changed.
 */
        public static void ViewStats(Scanner sc, CatWellBeing CatStats){
            // NEEDS WORK DESPERATELY!! , THE STATS IS OFF
            //System.out.println("Your cats name is " + name);
            System.out.println();
            System.out.println("Stats:");

            // listing stats from CatWellBeing class
            System.out.println("Hunger:" + CatStats.hunger );
            System.out.println("Happiness:" + CatStats.happiness );
            System.out.println("Health:" + CatStats.health );
            System.out.println();
            Options(sc, CatStats);
        }

        public static void Exit(){
            System.out.println("Goodbye!");
            System.exit(0);
        }

        public static void PetCat(Scanner sc, CatWellBeing CatStats){
            System.out.println("The cat appreciates the Pets!");
            CatPicture2();
            Options(sc, CatStats);
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
    }