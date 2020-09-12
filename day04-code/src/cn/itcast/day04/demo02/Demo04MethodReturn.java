package cn.itcast.day04.demo02;

public class Demo04MethodReturn {
    public static void main(String[] args) {
        int sum = getSum(188,222);
        System.out.println("return:"+sum);

        printSum(333,333);
    }
    public static int getSum(int a,int b){
        return a + b;
    }
    public static void printSum(int a, int b){
        System.out.println("return:"+ (a+b));
    }
}
