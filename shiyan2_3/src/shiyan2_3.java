public class shiyan2_3 {
    public static void main(String[] args)
    {
        String str="0100110001010001";
        int sum=0;
        for(int i=1;i<=str.length();i++) {//每次取i个长度
            String[] str1=new String[str.length()+1-i];//定义一个数组存放截取的字符串
            int m=0;//数组中已存入元素个数
            for(int j=0;j<str.length()+1-i;j++) {//取到哪位结束
                String str2=str.substring(j,j+i);//截取字符串
                //判断数组单中是否已存在该字符串
                boolean sign=true;
                for(int n=0;n<=m;n++) {
                    if(str2.equals(str1[n])) {
                        sign=false;
                        break;
                    }
                }
                //存入数组
                if(sign) {
                    str1[m]=str2;
                    System.out.println(str2);
                    m++;
                    sum++;
                }
            }
        }
        System.out.println("sum:"+sum);
    }
}
