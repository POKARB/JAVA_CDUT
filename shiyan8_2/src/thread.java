public class thread implements Runnable{
    public void run()
    {
         change();
    }
    private synchronized void change() {
        while (true) {
            if (Thread.currentThread().getName().equals("A") && (shiyan8_2.i == 0)) {
                shiyan8_2.i++;
                System.out.println(shiyan8_2.i);
                notifyAll();
            } else if (Thread.currentThread().getName().equals("A")) {
                while (!(shiyan8_2.i == 0)) {
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }
                }
                shiyan8_2.i++;
                System.out.println(shiyan8_2.i);
                notifyAll();
            }
            if (Thread.currentThread().getName().equals("B") && (shiyan8_2.i == 1) && (shiyan8_2.flag == false)) {
                shiyan8_2.i++;
                shiyan8_2.flag = true;
                System.out.println(shiyan8_2.i);
                notifyAll();
            } else if (Thread.currentThread().getName().equals("B")) {
                while (!((shiyan8_2.i == 1) && (shiyan8_2.flag == false))) {
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }
                }
                shiyan8_2.i++;
                shiyan8_2.flag = true;
                System.out.println(shiyan8_2.i);
                notifyAll();
            }
            if (Thread.currentThread().getName().equals("C") && (shiyan8_2.i == 2)) {
                shiyan8_2.i--;
                System.out.println(shiyan8_2.i);
                notifyAll();
            } else if (Thread.currentThread().getName().equals("C")) {
                while (!(shiyan8_2.i == 2)) {
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }
                }
                shiyan8_2.i--;
                System.out.println(shiyan8_2.i);
                notifyAll();
            }
            if (Thread.currentThread().getName().equals("D") && (shiyan8_2.i == 1) && (shiyan8_2.flag == true)) {
                shiyan8_2.i--;
                shiyan8_2.flag = false;
                System.out.println(shiyan8_2.i);
                notifyAll();
            } else if (Thread.currentThread().getName().equals("D")) {
                while (!((shiyan8_2.i == 1) && (shiyan8_2.flag == true))) {
                    try {
                        wait();
                    } catch (InterruptedException e) {

                    }
                }
                shiyan8_2.i--;
                shiyan8_2.flag = false;
                System.out.println(shiyan8_2.i);
                notifyAll();
            }
        }
    }
}
