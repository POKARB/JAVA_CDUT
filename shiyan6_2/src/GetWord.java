import java.util.Scanner;

public class GetWord {
    public String[] giveWord(String s)
    {
        String regex = "[^a-zA-Z]+";
        String result[] = s.split(regex);
        return result;
    }
}
