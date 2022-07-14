/* 文件名 : MammalInt.java */

public class MammalInt implements Animal{
    @Override
    public void eat() {
        System.out.println("Mammal eats");
    }
    public void travel(){
        System.out.println("Mammal trvels");
    }

    public void nolfeg(){
        System.out.println("自己的类");
    }

    public static void main(String args[]){
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }
}