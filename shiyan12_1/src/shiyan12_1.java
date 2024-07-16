import java.sql.*;

/*
mydb中有student表，结构如下：
id name cardid class
1  小明  001    001
2  小红  002    001
3  小亮  003    002
4  小刚  004    002
*/
public class shiyan12_1 {
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

        //定义sql语句
        String sql = "SELECT id, name, cardid, class  FROM student";

        //执行查询
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(sql);

        // 展开结果集数据库
        while(rs.next()){
            // 通过字段检索
            int id  = rs.getInt("id");
            String name = rs.getString("name");
            String cardid = rs.getString("cardid");
            String Class = rs.getString("class");

            // 输出数据
            System.out.print("ID: " + id);
            System.out.print(", 名字: " + name);
            System.out.print(", 卡号: " + cardid);
            System.out.print(", 班级：" + Class);
            System.out.print("\n");
        }

        //结束后关闭资源
        rs.close();
        stat.close();
        conn.close();
    }
}
