package cn.itcast.day05.demo02;

public class Demo04ArrayMax {

    public static void main(String[] args) {
        int[] Array = {23, 46, 6, 7, 888, 9999, 333};
        int max = Array[0];
        for (int i = 1; i < Array.length; i++){
            if (Array[i] > max) {
                max = Array[i];
            }
        }
        System.out.println(max);
    }
}
