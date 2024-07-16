import java.util.Scanner;

public class shiyan5_2 {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("请输入一个要查询的数：");
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        Solution solution = new Solution();
        if(solution.Find(x,input.InputMatrix()) == true)
        {
            System.out.println("存在该整数");
        }
        else
        {
            System.out.println("不存在该整数");
        }
    }
}
