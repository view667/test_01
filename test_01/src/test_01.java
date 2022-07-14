import java.awt.*;

public class test_01 {
    public static void main(String[] args){
        System.out.println(sum(10 ,20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10.0, 20.0, 30.0));

        int[] arr = new int[]{1,2,3};
        int[] arr2 = new int[]{4, 5, 6};
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        System.out.println("==================");
        for(int x=0; x<3; x++){
            System.out.println(arr2[x]);
        }
        System.out.println("==================");

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("==================");

        // 获取数组的最值
        int[] arr3 = {12,3,1,21,312};

        int max = arr[0];

        for(int i=1; i<arr3.length; i++){
            if (arr3[i] > max){
                max = arr3[i];
            }

        }
        System.out.println(max);
    }





    public static int sum(int a, int b){
        return a + b;
    }

//      这样繁琐 下面直接重写方法
//    public static int sum2(int a, int b, int c){
//        return a + b + c;
//    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static double sum(double a, double b, double c){
        return a + b;
    }

}
