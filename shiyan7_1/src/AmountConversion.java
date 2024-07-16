
public class AmountConversion {

    /**
     * 金额转换，阿拉伯数字转换成中国传统形式。
     * 例如：101000001010   转换为   壹仟零壹拾亿零壹仟零壹拾圆整
     * 分析问题:
     a、小数点之前为整数，小数点后只有两位，为角分。
     b、小数点之前单位依次为 圆，拾，佰，仟，万，拾万，佰万，仟万，亿……
     c、每位的数字对应为：零、壹、贰、叁、肆、伍、陆、柒、捌、玖。
     思路：
     a、用两个数组，capNumber[10]、分别存储零、壹、贰、叁、肆、伍、陆、柒、捌、玖。
     unit[] 0，圆，拾，佰，仟，万，亿
     b、针对整数部分，从拾开始除，余数转换为汉字，取对应余数值得数组array1[余数]所对应的值。
     取得到的商，并记录除的次数。次数对应为array[次数]的汉字。拼接。
     c、反复第二步，直到商为0。
     d、其中余位为0时特殊处理。
     e、小数点后统一处理两次。
     举例：     5667234。
     5667234/10  商566723    余4  除次数为1  capNumber[4]+unit[1]=肆圆
     566723/10   商56672     余3  除次数为2  capNumber[3]+unit[2]=叁拾
     56672/10    商5667      余2  除次数为3  capNumber[2]+unit[3]=贰佰
     5667/10     商566       余7  除次数为4  capNumber[7]+unit[4]=肆仟

     566/10      商56        余6  除次数为5  capNumber[6]+unit[5]=陆万
     56/10       商5         余6  除次数为6  capNumber[6]+unit[6]=陆拾
     5/10        商0         余5  除次数为7  capNumber[5]+unit[7]=伍佰
     商为0,并且余数也为0时,结束
     */
    public static void Output(String s)
    {
        String capNumber[] = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};     //capNumber[]存储大写数字汉字
        String unit[] = {"","圆","拾","佰","仟","万","拾","佰","仟","亿","拾","佰","仟"}; //unit[]存储每一个位数所对应的大写汉字单位  unit[0]="",方便对应。
        String floatunit[] = {"","角","分","厘"};
        long num;
        String int_s;
        //截出s中的整数部分
        int index = s.indexOf(".");
        if(index == -1)
        {
            int_s = s;
        }
        else
        {
            int_s = s.substring(0,index);
        }
        //判断输入数据合理性
        while(true){
            num = Long.parseLong(int_s);
            String line = num +"";
            if(line.length() > 12){
                System.out.println("您输入的数据位数过大！请重输：");
            }else {
                break;
            }
        }
        int times = 0;                                      //记录除的次数
        long shang = 0;                                     //记录每一次的商
        long yushu = 0;                                     //记录每一次的余数
        String str = "";
        while(true){
            shang = num / 10;                              //得到商
            yushu = num % 10;                              //得到余数
            if(shang == 0 && yushu == 0){                  //当商和余数同时为0时退出循环
                break;
            }else{                                         //否则,将商重新赋值给num,继续循环
                num = shang;
            }
            times++;                                       //次数加1,得到每位数据
            str =  capNumber[ (int) yushu]+unit[times] + str;   //将大写数字汉字和大写单位连接赋值给str
        }                                                       //去除字符串中的0
        str = str.replaceAll("零[拾佰仟]","零").replaceAll("零+亿","亿").replaceAll("零{4}万", "")
                .replaceAll("零+万","万").replaceAll("零+圆","圆").replaceAll("零+", "零");
        if(index == -1)  //不包含小数部分，直接输出整数
        {
            str = str + "整";
            System.out.println("阿拉伯数字转换成中国传统形式为: ");
            System.out.println(str);
        }
        else
        {
            int length_float = s.length() - index - 1;  //小数部分的长度
            for(int i = 1 ;length_float > 0;length_float--)
            {
                char ch = s.charAt(index + i);
                str = str + capNumber[ch-48]+floatunit[i];  //直接使用“char型-48"计数
                i++;
            }
        }
        str = str.replaceAll("零[角分厘]","");
        System.out.println("阿拉伯数字转换成中国传统形式为: ");
        System.out.println(str);
    }
}
