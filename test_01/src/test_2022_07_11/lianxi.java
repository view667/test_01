package test_2022_07_11;

public class lianxi {
    public static  void main(String args[]){
        for (int counter=0; counter<=10; counter++){
            System.out.printf("%d! = %d\n", counter, fact(counter));
        }
    }
    public static long fact(long number){
        if (number <= 1){
            return 1;
        }
        else{
            return number * fact(number - 1);
        }
    }
}

