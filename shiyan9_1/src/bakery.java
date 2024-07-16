import java.time.LocalDateTime;
import java.util.Random;


public class bakery implements Runnable {
    Fridge fridge;
    LocalDateTime seed = LocalDateTime.now();
    Random num = new Random(seed.getNano());
    bakery()
    {
        fridge = new Fridge();
    }

    public void run() {
        if (Thread.currentThread().getName().equals("saler")) {
            BreadAmountChange();
        } else if (Thread.currentThread().getName().equals("worker")) {
            BreadAmountChange();
        }
    }

    public void BreadAmountChange() {
        if (Thread.currentThread().getName().equals("saler")) {
            while (true) {
                System.out.println("冰箱里有"+this.fridge.BreadAmount+"个面包");
                try {
                    Thread.sleep(num.nextInt(30) * 10);
                } catch (InterruptedException e) {

                }
                int SaleAmount = num.nextInt(10);
                System.out.println("要卖"+SaleAmount+"个面包");
                while (SaleAmount != 0) {
                    while (this.fridge.BreadAmount == 0) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {

                        }
                    }
                    if (this.fridge.BreadAmount >= SaleAmount) {
                        System.out.println("卖了"+SaleAmount+"个面包");
                        this.fridge.BreadAmount = this.fridge.BreadAmount - SaleAmount;
                        System.out.println("还剩"+this.fridge.BreadAmount+"个面包");
                        SaleAmount = 0;
                    } else {
                        System.out.println("卖了"+(this.fridge.BreadAmount)+"个面包");
                        SaleAmount = SaleAmount - this.fridge.BreadAmount;
                        this.fridge.BreadAmount = 0;
                    }
                }
            }
        }else if (Thread.currentThread().getName().equals("worker")){
            while (true) {
                this.fridge.BreadAmount++;
                System.out.println("面包++");
                System.out.println("还剩"+this.fridge.BreadAmount+"个面包");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
                while (fridge.BreadAmount == fridge.MAX) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                }
            }
        }
    }
}

