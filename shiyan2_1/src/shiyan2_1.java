import java.util.HashMap;

public class shiyan2_1 {
    public static void main(String[] args) {
        int count = 0;
        for (Integer i = 1; i < 2021; i++) {
            if (Integer.toString(i).contains("2") || Integer.toString(i).contains("4")) {
                continue;
            }
            for (Integer j = 1; j < 2021; j++) {
                if (Integer.toString(j).contains("2") || Integer.toString(j).contains("4")) {
                    continue;
                }
                for (Integer j2 = 1; j2 < 2021; j2++) {
                    if (Integer.toString(j2).contains("2") || Integer.toString(j2).contains("4")) {
                        continue;
                    }
                    //把Integer转成Int类型，这样好进行比较和求和
                    if (i.intValue() != j.intValue() && i.intValue() != j2.intValue() && j.intValue() != j2.intValue()) {
                        if (i.intValue() + j.intValue() + j2.intValue() == 2019) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println("总数是：" + count / 6);
    }
}