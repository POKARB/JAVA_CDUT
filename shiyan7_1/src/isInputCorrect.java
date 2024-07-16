import java.util.Scanner;

public class isInputCorrect {
        StringBuffer strBuffer;
        String datatype;
        public isInputCorrect()
        {
            this.strBuffer = new StringBuffer("");
        }
        public void InputString()
        {
            boolean i = true;
            while(i)
            {
                System.out.println("请输入一个阿拉伯数字金额，如：1105.05");
                System.out.println("整数部分不可超过12位，小数部分不可超过三位");
                System.out.println("注：1.0或2.10将被认为是错误的，请输入1或2.1");
                Scanner reader = new Scanner(System.in);
                String s = reader.nextLine();
                if(isIntegerFormat(s) == true)
                {
                    i = false;
                    this.strBuffer.append(s);
                    this.datatype = "Int";
                }
                else if(isFloatFormat(s) == true)
                {
                    i = false;
                    this.strBuffer.append(s);
                    this.datatype = "Float";
                }
                else
                {
                    System.out.println("格式错误，请重新输入");
                }
            }
        }
        public static boolean isIntegerFormat(String num) {

            String regex="(-?[1-9]\\d{0,11})|0";
            return num.matches(regex);
        }

        public static boolean isFloatFormat(String num) {
            String regex = "-?(0|[1-9]\\d{0,11})(\\.\\d{0,2}[1-9])";
            if (num.equals("-0"))
                return false;
            return num.matches(regex);
        }
}

