public class Train extends vehicle{
    public Train()
    {
        this.EngineNumber = "00000002";
    }
    public void Run()
    {
        this.Speed = 300;
    }
    public void Stop()
    {
        this.Speed = 0;
    }
}
