public class Puppy {
    int puppyAge;
    public Puppy(String name){
        System.out.println("名字是：" + name);
    }

    public void SetAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("年龄是：" +puppyAge);
        return puppyAge;
    }

    public static void main(String[] args){

        Puppy myPuppy = new Puppy("Tony");
        myPuppy.SetAge( 2 );
        myPuppy.getAge();
        System.out.println("变量值：" + myPuppy.puppyAge);

        float floatVar = 132.343f;
        int intVar = 3;
        String stringVar = "23232";

        System.out.printf("浮点数类型值为:%f,"+"整型变量的值为:%d,"+"字符串变量的值为:%s", floatVar, intVar, stringVar);

        String fs;
        fs = String.format("浮点数类型值为:%f,"+"整型变量的值为:%d,"+"字符串变量的值为:%s", floatVar, intVar, stringVar);
    }

}
