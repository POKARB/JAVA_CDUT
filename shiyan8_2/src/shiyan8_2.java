public class shiyan8_2 {
    static int i;
    static boolean flag;
    shiyan8_2()
    {
        this.i = 0;
        this.flag = false;
    }
    public static void main(String[] args) {
        System.out.println(i);
        thread thread = new thread();
        Thread A,B,C,D;
        A = new Thread(thread);
        B = new Thread(thread);
        C = new Thread(thread);
        D = new Thread(thread);
        A.setName("A");
        B.setName("B");
        C.setName("C");
        D.setName("D");
        A.start();
        B.start();
        C.start();
        D.start();
    }
}
