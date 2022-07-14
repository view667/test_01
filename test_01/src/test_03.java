import java.util.Scanner;

public class test_03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("next方式接收：");
        if (scan.hasNext()){
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
        }
        scan.close();
    }
}
