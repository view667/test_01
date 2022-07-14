import java.util.Scanner;

public class in_OUT {
    public static void main(String[] args){
        String[] strArray = {"","星期一","星期二","星期三","星期四","星期五","星期六","星期日"};

        System.out.println("请输入一个数字（1-7）：");
        Scanner sc = new Scanner(System.in);


        int week = sc.nextInt();

        System.out.println("你想要的是：" + strArray[week]);

    }

}
