package cn.itcast.day04.demo03;

public class Demo04MethodNotice {
    public static void main(String[] args) {
        System.out.println(getMax(44,33));
    }
    public static int getMax(int a,int b){
        return a > b? a : b;
    }
}
