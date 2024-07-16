import java.util.Scanner;

public class shiyan6_2 {
    public static void main(String[] args) {
        System.out.println("请随机输入一个网址：");
        Scanner reader = new Scanner(System.in);
        String s = new String();
        String s_spilt[];
        s = reader.nextLine();
        GetWord getWord = new GetWord();
        s_spilt = getWord.giveWord(s);
        if (s_spilt[0].length() == 0)
        {
            System.out.println("该网址中含有"+ (s_spilt.length-1) +"个单词");
        }
        else
        {
            System.out.println("该网址中含有"+s_spilt.length+"个单词");
        }
        if (s_spilt[0].length() == 0)
        {
            for(int i = 1 ; i<s_spilt.length ;i++)
            {
                System.out.println(s_spilt[i]);
            }
        }
        else
        {
            for(int i = 0 ; i<s_spilt.length ;i++)
            {
                System.out.println(s_spilt[i]);
            }
        }
    }
}
