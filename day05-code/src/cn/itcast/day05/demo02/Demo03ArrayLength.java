package cn.itcast.day05.demo02;

import java.util.Arrays;

public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] Array = new int[3];
        int[] ArrayB ={10,20,34,453,534,5,5,443,34,43,4,3543,545,22};
        //array.length 获取数组长度
        System.out.println(ArrayB.length);
        System.out.println(Arrays.toString(ArrayB));
        for (int i = 0; i < ArrayB.length; i++) {
            System.out.println(ArrayB[i]);
        }
    }
}
