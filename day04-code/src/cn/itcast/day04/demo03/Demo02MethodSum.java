package cn.itcast.day04.demo03;

public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println(getSum100());
    }
    public static int getSum100(){
        int sum =0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
