public class shiyan8_1 {
    public static void main(String[] args) {
        Runway runway1 = new Runway();
        Thread rabbit,turtle;
        turtle = new Thread(runway1);
        rabbit = new Thread(runway1);
        turtle.setName("乌龟");
        rabbit.setName("兔子");
        turtle.start();
        rabbit.start();
    }
}
