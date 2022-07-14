import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = {1,8, 4, 22, 5, 6, 7, 242, 24};
        quickSort(arr, 0, 8);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int L, int R) {
        int i = L;
        int j = R;


        //支点
        int pivot = arr[(L + R) / 2];

        //左右两端进行扫描，只要两端还没有交替，就一致扫描
        while (i <= j){
            //寻找直到比支点大的数
            while (pivot > arr[i]) {
                i++;
            }
            //寻找直到比支点小的数
            while (pivot < arr[j]) {
                j--;
            }
            //此时已经分别找到了比支点小的数（右边）.比支点大的数（左边），他们进行交换
            if(i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (L < j)
            quickSort(arr, L, j);

        if (i < R)
            quickSort(arr, i, R);


//        System.out.println("关注公众号"+ count);
//        System.out.println(arr[1]);
    }
}