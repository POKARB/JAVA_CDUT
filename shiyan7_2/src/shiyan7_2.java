public class shiyan7_2 {
    public static void main(String[] args)
    {
        Queue queue1 = new Queue();
        queue1.IsEmpty();
        queue1.InQueue("element1");
        queue1.InQueue("element2");
        queue1.InQueue(3);
        System.out.println(queue1.list);
        queue1.OutQueue();
        System.out.println(queue1.list);
    }
}
