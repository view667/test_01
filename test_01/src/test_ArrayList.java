

import java.util.ArrayList;
public class test_ArrayList {
    public static void main(String[] args){
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("taobo");
        sites.add("weibo");
        System.out.println(sites);
        System.out.println(sites.get(1));

        sites.set(1, "Root");
        System.out.println(sites);

        sites.remove(1);
        System.out.println(sites);

        for (int i=0; i<sites.size(); i++){
            System.out.println(sites.get(i));
        }

        for (String i : sites){
            System.out.println(i);
        }
    }
}

