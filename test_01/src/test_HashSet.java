import java.util.HashSet;
import java.util.HashMap;

import java.util.ArrayList;
import java.util.Iterator;

public class test_HashSet {
    public static void main(String[] args){
        HashSet<String> sites = new HashSet<String>();
        sites.add("www.");
        sites.add("baidu");
        sites.add(".com");
        sites.add("www.");
        for(String i : sites){
            System.out.println(i);
        }

        //hashMap散列表 存储键值对（key-value)映射   (值是整型， 键是字符串）
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();

        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        System.out.println(Sites);
        Sites.clear();
        System.out.println(Sites);

        //获取一个迭代器
        ArrayList<String> ssites = new ArrayList<String>();
        ssites.add("a");
        ssites.add("b");
        ssites.add("c");
        ssites.add("d");

        Iterator<String> it = ssites.iterator();

//        System.out.println(it.next());
//        System.out.println(it.next());
        System.out.println("=====================");

        while (it.hasNext()){
            System.out.println(it.next());
        }




    }

}
