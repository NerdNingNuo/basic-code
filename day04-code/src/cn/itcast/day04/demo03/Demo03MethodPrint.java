package cn.itcast.day04.demo03;

public class Demo03MethodPrint {
    public static void main(String[] args) {
        getprint(3);
    }
    public static void getprint(int a){
        for (int i = 0; i < a; i++) {
            System.out.println("Hello World!");
        }
    }
}
