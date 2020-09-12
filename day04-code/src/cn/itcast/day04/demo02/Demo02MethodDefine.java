package cn.itcast.day04.demo02;
/*
*方法的三种调用方式：
* 1.赋值调用
* 2.打印调用
* 3.单独调用
* */
public class Demo02MethodDefine {
    public static void main(String[] args) {
        System.out.println(sum(111,222));
        System.out.println("==========");
        sum(1,4);
        System.out.println("==========");
        System.out.println(sum(7,sum(7788877,3234233)));
        System.out.println("==========");

    }
    public static int sum(int a,int b){
        System.out.println("method run !");
        return a + b;
    }
}
