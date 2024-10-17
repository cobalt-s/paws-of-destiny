public class CatWellBeing {
    int health = 100;
    int hunger = 50;
    int happiness =  105;

    public static int modifyHealth(int addedAmount){
        int health = 50;
        health += addedAmount;
        return health;
    }

    public static int modifyHunger(int addedAmount){
        int hunger = 51;
        hunger += addedAmount;
        return hunger;
    }

    public static int modifyHappiness(int addedAmount){
        int happiness = 60;
        happiness += addedAmount;
        return happiness;
    }

}
