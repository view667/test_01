import java.util.*;
import java.text.*;
import java.util.regex.*;


public class test_02_20220706 {
    public static void main(String[] args) {

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        System.out.println("当前时间为：" + ft.format(dNow));

        String content = "I am noob" + "from runoob.com.";

        String pattern = ".*runoob.*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否也包含了 'runoob' 字符串？  " + isMatch);
    }
}

