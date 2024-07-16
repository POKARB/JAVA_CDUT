import java.util.Scanner;

public class shiyan4_1 {
    public static void main(String[] args) {
    vehicle a;
    System.out.print("请随机输入一个非负整数：");
    Scanner reader = new Scanner(System.in);
    int x = reader.nextInt();
    if(x % 3 == 0)
    {
        a = new Car();
        a.Run();
        System.out.print("选择汽车，速度为"+a.Speed);
    }
    else if (x % 3 == 1)
    {
        a = new Plane();
        a.Run();
        System.out.print("选择飞机，速度为"+a.Speed);
    }
    else if (x % 3 == 2)
    {
        a = new Train();
        a.Run();
        System.out.print("选择火车，速度为"+a.Speed);
    }

    }
}
