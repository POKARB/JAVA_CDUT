import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class shiyan11_1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Student student1 = new Student();
        Student student2 = new Student();
        student1.id = "1";
        student1.name = "张三";
        student1.sex = "男";
        student2.id = "2";
        student2.name = "李四";
        student2.sex = "男";
        list.add(student1);
        list.add(student2);

        ObjectOutputStream oos=null;
        try {
            oos=new ObjectOutputStream(new FileOutputStream("./tmp/student.txt"));
//			 System.out.println(stu);
            oos.writeObject(list);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            try {
                oos.close();
                System.out.println("...file has saved ./tmp/student.txt");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        ObjectInputStream ois=null;
        //反序列化显示集合中信息,得到新的集合
        try {
            ois = new ObjectInputStream(new FileInputStream("./tmp/student.txt"));
        }catch(IOException e){
            e.printStackTrace();
        }
        try {
            ArrayList<Student> list2 = (ArrayList<Student>) ois.readObject();
        //遍历集合
        for (int i = 0; i < list2.size(); i++) {
            Student stu=list.get(i);
            System.out.println(stu.id+" "+stu.name+" "+stu.sex);
        }
        }catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }
    }
}
