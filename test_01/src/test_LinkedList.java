import java.util.LinkedList;

public class test_LinkedList {
    public static void main(String[] args){
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("taobo");
        sites.add("weibo");

        sites.addFirst("Wiki");
        System.out.println(sites);
        System.out.println("===");
    }
}
