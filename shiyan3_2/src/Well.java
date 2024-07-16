public class Well {
    int WaterAmount;
    public Well()
    {
        this.WaterAmount = 100;
        System.out.println("新的一天，水井里有"+this.WaterAmount+"升水");
    }
    public void DrinkWater(int DrinkAmount)
    {
        if(this.WaterAmount - DrinkAmount < 0)
        {
            System.out.println("水井里的水不够第"+DrinkAmount+"户饮水");
        }
        else
        {
            this.WaterAmount =this.WaterAmount - DrinkAmount;
            System.out.println("第"+DrinkAmount+"户饮水，水井里还剩"+this.WaterAmount+"升水");
        }

    }
}
