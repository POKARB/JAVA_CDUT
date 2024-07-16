public class shiyan9_1
{
    public static void main(String[] args)
    {
        bakery bakery1 = new bakery();
        Thread saler = new Thread(bakery1);
        Thread worker = new Thread(bakery1);
        saler.setName("saler");
        worker.setName("worker");
        saler.start();
        worker.start();
    }
}
