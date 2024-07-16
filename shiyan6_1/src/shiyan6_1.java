import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class shiyan6_1 {
    public static void main(String[] args) {
        int n = -1;
        byte[] a = new byte[100];
        try
        {
            FileInputStream in = new FileInputStream("test.txt");
            while ((n=in.read(a,0,100))!=-1)
            {
                String s = new String(a,0,n);
                System.out.println(s);
            }
        }
        catch (IOException e)
        {
            System.out.println("File read error:"+e);
        }

    }
}
