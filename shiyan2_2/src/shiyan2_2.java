import java.util.Scanner;

public class shiyan2_2
{
    public static void main(String[] args)
    {
        double[] mylist = new double[10];
        System.out.println("请输入十个数字，用空格做分隔");
        Scanner reader =new Scanner(System.in);
        int i = 0;
        while(i!=10)
        {
            mylist[i] = reader.nextDouble();
            i++;
        }
        InsertSort(mylist);
    }
    public static void SelectionSort(double[] list)
    {
        for(int i = 0;i < 10;i++)
        {
            int min = i;
            for(int j = i;j < 10;j++)
            {
                if(list[j] < list[min])
                {
                    min = j;
                }
            }
            double temp;
            temp = list[i];
            list[i] = list[min];
            list[min] = temp;
        }
        for(int x = 0;x<10;x++)
        {
            System.out.println(list[x]);
        }
    }
    public static void BubbleSort(double[] list)
    {
        for(int i = 0;i < 10;i++)
        {
            for(int j = 0;j < 9;j++)
            {
                if(list[j+1] < list[j])
                {
                    double temp;
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        for(int x = 0;x<10;x++)
        {
            System.out.println(list[x]);
        }
    }

    public static void InsertSort(double[] list)
    {
        double temp;
        int j;
        for(int i=1;i<10;i++)
        {
            if (list[i] < list[i - 1]) {
                temp = list[i];
                for (j = i - 1; j >= 0 && temp < list[j]; j--) {
                    list[j + 1] = list[j];
                }
                list[j + 1] = temp;
            }
        }
        for(int x = 0;x<10;x++)
        {
            System.out.println(list[x]);
        }
    }
}

