public class monster implements State{
    double HP;
    double DEF;
    double ATK;
    String Genres;
    public monster()
    {
        HP = 200;
        DEF = 200;
        ATK = 200;
        Genres = "Slime";
    }
    @Override
    public void Idle()
    {
        System.out.println("monster正在站立...");
    }
    @Override
    public void Run()
    {
        System.out.println("monster正在奔跑...");
    }
    @Override
    public void Attack()
    {
        System.out.println("monster正在攻击...");
    }
    @Override
    public void Dead()
    {
        System.out.println("monster已经死亡");
    }
}
