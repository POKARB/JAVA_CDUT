import java.util.ArrayList;

public class Queue <T>{
    int real,front;
    ArrayList<T> list;
    Queue()
    {
        this.list = new ArrayList<>();
    }
    void InQueue(T element)
    {
        list.add(element);
    }
    void OutQueue()
    {
        list.remove(0);
    }
    void IsEmpty()
    {
        if(this.list.isEmpty())
        {
            System.out.println("队列是空的！");
        }
        else
        {
            System.out.println("队列是非空的！");
        }
    }
}
