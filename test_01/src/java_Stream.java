import java.io.*;
import java.io.File;

public class java_Stream {

    //读取控制台
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter ’end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals(("end")));
    }





}
//    //读取目录
//    String dirname = "/tmp";
//    File f1 = new File (dirname);
//    if (f1.isDirectory())
//
//    {
//        System.out.println("目录" + dirname);
//        String s[] = f1.list();
//        for (int i = 0; i < s.length; i++) {
//            File f = new File(dirname + "/" + s[i]);
//            if (f.isDirectory()) {
//                System.out.println(s[i] + "是一个目录");
//            } else {
//                System.out.println(s[i] + "是一个文件");
//            }
//        }
//    }else {
//        System.out.println(dirname + "不是一个目录");
//    }
//
// }
//}