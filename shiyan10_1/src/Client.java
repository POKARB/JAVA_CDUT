import java.io.*;
import java.net.*;
import java.util.Scanner;
/*
     （1）已知client端，提交计算表达式请求，如：3+4
     （2）在server服务器端完成运算并将结果返回给client端
     （3）使用TCP/IP的套接字编程完成程序
     （4）能反复运算
*/
public class Client {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
//		创建键盘接收器对象
        int mess1= 0;
        char me=0;
        int mess2=0;
        Socket mysocket;
//		Socket类实现客户端套接字
        DataInputStream in=null;
//		读取服务器的回答的io流
        DataOutputStream out=null;
//		向服务器提问的io流
        try {
            mysocket=new Socket("127.0.0.1",2010);
//			端口号是服务器端与客户端链接的通路标志，通过端口号与服务器建立连接
            in=new DataInputStream(mysocket.getInputStream());
//			注意DataInputStream的创建
            out=new DataOutputStream(mysocket.getOutputStream());
//			注意DataOutputStream的创建
            while(true) {
                System.out.println("请输入您要计算的式子:");
                mess1=s.nextInt();
                me=(char)s.next().charAt(0);
                mess2=s.nextInt();
                out.writeInt(mess1);
                out.writeChar(me);
                out.writeInt(mess2);
                int answer=in.readInt();
//				读取信息，堵塞状态
                System.out.println("客户收到服务的回答："+answer);
            }
        }catch(Exception e) {
            System.out.println("服务器已断开"+e);
        };
    }
}