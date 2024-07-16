import java.util.Random;

public class shiyan3_2 {
    public static void main(String args[])
    {
        Well well1 = new Well();
        Family family1 = new Family();
        for (int i = 0; i < 20; i++)
        {
            well1.DrinkWater(family1.FamilyArray[i]);
        }
    }
}
