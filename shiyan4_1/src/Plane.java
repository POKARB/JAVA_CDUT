public class Plane extends vehicle{
    public Plane()
    {
        this.EngineNumber = "00000003";
    }
    public void Run()
    {
        this.Speed = 1000;
    }
    public void Stop()
    {
        this.Speed = 0;
    }
}
