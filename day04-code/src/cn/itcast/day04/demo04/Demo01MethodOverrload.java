package cn.itcast.day04.demo04;
//方法的重载：多个方法名一样，但是参数泪飙不一样
public class Demo01MethodOverrload {
    public static void main(String[] args) {

    }
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b +c;
    }

}
