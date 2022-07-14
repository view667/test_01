//当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。


public class StringBuffer_test {

    //数组作为函数的参数练习
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
    //数组作为函数的返回值
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }


    public static void main(String[] args) {
        //速度快，线程不安全使用StringBuilder
        StringBuilder sb = new StringBuilder(10);
        sb.append("Runoob..");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.insert(8, "Java");
        System.out.println(sb);
        sb.delete(5, 8);
        System.out.println(sb);

        //线程安全使用StringBuffer
        StringBuffer sBuffer = new StringBuffer("baidu:");
        sBuffer.append("www");
        sBuffer.append(".baidu");
        sBuffer.append(".com");
        System.out.println(sBuffer);

        int[] listInt = {12, 323, 4242, 121};
        int[] listInt2 = new int[]{11, 23, 424, 2, 523};
        for (int i = 0; i < listInt.length; i++) {
            System.out.println(listInt[i]);
        }

        //JDK1.5的 For-Each循环来输出数组中的所有元素
        double[] myList = {1.6, 3.2, 6.3, 1.3};
        //打印所有数组元素
        for (double element : myList) {
            System.out.println(element);
        }

        //数组作为函数的参数练习
        printArray(new int[]{2, 3, 5, 32, 5, 2});
        printArray(new int[]{2, 3, 24, 23});

        System.out.println("\n");
        System.out.println("======================");
        //数组作为函数的返回值
        int[] arr = reverse(new int[]{2,3,7,9,12,17,24});
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}




