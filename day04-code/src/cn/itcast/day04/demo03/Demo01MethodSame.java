package cn.itcast.day04.demo03;

public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(37,33));
        System.out.println(isSame(37,37));
    }
    public static boolean isSame(int a,int b){
        return a == b;
    }
}
