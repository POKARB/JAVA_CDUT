public class Runway implements Runnable{
    int TurtleDistance;
    int RabbitDistance;
    public Runway()
    {
        this.RabbitDistance = 400;
        this.TurtleDistance = 0;
    }
    public void run()
    {
        while (true) {
            String name = Thread.currentThread().getName();
            if (name.equals("乌龟")) {
                this.TurtleDistance += 1;
                System.out.println("乌龟跑了" + this.TurtleDistance + "m");
            } else if (name.equals("兔子")) {
                this.RabbitDistance += 5;
                System.out.println("兔子跑了" + this.RabbitDistance + "m");
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            if (this.TurtleDistance >= 1000 || this.RabbitDistance >= 1000) {
                return;
            }
        }

    }
}
