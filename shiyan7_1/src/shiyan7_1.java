public class shiyan7_1 {
    public static void main(String[] args) {
        isInputCorrect isInputCorrect = new isInputCorrect();
        isInputCorrect.InputString();
        String str = isInputCorrect.strBuffer.toString();
        AmountConversion.Output(str);
        System.out.println(isInputCorrect.strBuffer);
    }
}