public class shiyan9_2 {
    public static void main(String[] args) {
        TicketWindow st = new TicketWindow();

        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口2");
        Thread t3 = new Thread(st, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
