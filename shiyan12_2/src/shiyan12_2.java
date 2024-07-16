import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
mydb中有student表，结构如下：
id name cardid class
1  小明  001    001
2  小红  002    001
3  小亮  003    002
4  帅士煜  004    002

mydb中有Courses表，结构如下：
id name
1  信号与系统
2  通信原理
3  数字信号处理

mydb中有Enrollments表，结构如下：
student_id（外键，关联到学生表的id）  course_id（外键，关联到课程表的id）
1                                1
1                                2
1                                3
2                                1
2                                3
3                                2
4                                2
*/

public class shiyan12_2 {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) throws Exception {
        Connection conn = null;

        // 注册 JDBC 驱动
        Class.forName(JDBC_DRIVER);

        // 打开链接
        System.out.println("连接数据库...");
        conn = DriverManager.getConnection(DB_URL,USER,PASS);

        // 输入需要查询的学生id（学生的cardid）
        System.out.println("请输入要查询的学生的cardid（输入exit退出）：");
        System.out.println("注：输入一个cardid后按下回车后继续输入，最后输入exit退出");
        List<String> cardIds = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")) {
            cardIds.add(input);
        }

        // 准备SQL查询
        String result = String.join(", ", cardIds);
        String sql = "SELECT student.cardid, courses.course_name FROM student " +
                "JOIN enrollments ON student.id = enrollments.student_id " +
                "JOIN courses ON enrollments.course_id = courses.id " +
                "WHERE student.cardid IN ("+ result +")";
        System.out.println(sql);

        // 执行查询
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(sql);

        // 展开结果集数据库
        while(rs.next()){
            // 通过字段检索
            String course_name = rs.getString("course_name");
            String cardid = rs.getString("cardid");

            // 输出数据
            System.out.print("CARDID: " + cardid);
            System.out.print(", 课程名字: " + course_name);
            System.out.print("\n");
        }
    }
}
