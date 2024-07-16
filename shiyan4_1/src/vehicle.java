public abstract class vehicle {
    String Makers;  //厂商
    String EngineNumber;  //发动机型号
    String MakeNumber;  //制作型号
    String Time;  //制造时间YYYYMMDD
    double Speed;  //速度
    abstract void Run();  //运行
    abstract void Stop();  //停止
    public vehicle()
    {
        this.Makers = "CN";
        this.MakeNumber = "00000000";
        this.Time = "20240318";
    }
}
