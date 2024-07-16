import java.io.*;
import java.net.*;
//当用到网络编程时要导java.net.*;包

public class Server {
    public static void main(String args[]) {
        int answer=0;
        ServerSocket serverForClient=null;
//		ServerSocket类实现服务器套接字（只有一个用处好像，即申请服务器端口号）
        Socket socketOnServer=null;
//		Socket类实现客户端套接字
        DataOutputStream out=null;
        DataInputStream in=null;
        try {
            serverForClient =new ServerSocket(2010);
//			端口号是服务器端与客户端链接的通路标志，设置服务器端口号
        }catch(IOException e) {
            //如果端口号已经被占用，将触发异常
            System.out.println(e);
        }

        try {
            System.out.println("等待客户呼叫");
            socketOnServer=serverForClient.accept();
//			堵塞状态——等待客户端访问，获得客户端地址
            System.out.println("客户的地址："+socketOnServer.getInetAddress());
//			输出客户端的地址
            out=new DataOutputStream(socketOnServer.getOutputStream());
            in=new DataInputStream(socketOnServer.getInputStream());
            while(true) {
                int s1=in.readInt();
//				in读取信息，堵塞状态
                char u=in.readChar();
                int s2=in.readInt();
                System.out.println("服务器收到客户的提问："+s1+u+s2);
                switch(u) {
                    case '*':answer=s1*s2;break;
                    case '/':answer=s1/s2;break;
                    case '+':answer=s1+s2;break;
                    case '-':answer=s1-s2;break;
                    case '%':answer=s1%s2;break;
                }
                out.writeInt(answer);
            }
        }catch(Exception e) {
            System.out.println("客户已断开"+e);
        }
    }
}