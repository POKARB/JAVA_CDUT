public class hero implements State{
    double HP;
    double DEF;
    double ATK;
    public hero()
    {
        HP = 100;
        DEF = 100;
        ATK = 100;
    }
    @Override
    public void Idle()
    {
        System.out.println("hero正在站立...");
    }
    @Override
    public void Run()
    {
        System.out.println("hero正在奔跑...");
    }
    @Override
    public void Attack()
    {
        System.out.println("hero正在攻击...");
    }
    @Override
    public void Dead()
    {
        System.out.println("hero已经死亡");
    }
}
