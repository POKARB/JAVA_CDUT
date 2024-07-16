import java.util.Scanner;

public class Input {
    public int[][] InputMatrix()
    {
        System.out.println("二维数组的行、列数为：（格式为r c）");
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt();
        int c=scan.nextInt();
        System.out.println("请按照从左到右，从上到下递增的顺序输入整数：");
        int[][]matrix=new int[r][c];
        scan.nextLine();//用来跳过行列后的回车符
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=scan.nextInt();
                System.out.print(matrix[i][j]+",");
            }
            System.out.println("");
        }
        return matrix;
    }
}
