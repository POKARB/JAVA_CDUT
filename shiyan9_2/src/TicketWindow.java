import java.time.LocalDateTime;
import java.util.Random;

public class TicketWindow implements Runnable {
    // 车票数量
    private static int ticket = 30;
    LocalDateTime seed = LocalDateTime.now();
    Random num = new Random(seed.getNano());
    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(num.nextInt(10*1000));  //顾客随机到达
            } catch (InterruptedException e) {

            }
            synchronized (obj){  //互斥锁
                try {
                    Thread.sleep(100);  //线程休息100ms
                }catch (InterruptedException e){

                }
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖出了第" + ticket-- + "张票，" + "剩余" + ticket + "张票");
                } else {
                    System.out.println(Thread.currentThread().getName() + "余票不足,停止售票!");
                    break;
                }
            }
        }
    }
}
