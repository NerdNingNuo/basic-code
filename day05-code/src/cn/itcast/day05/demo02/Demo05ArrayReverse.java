package cn.itcast.day05.demo02;

import java.util.Arrays;

public class Demo05ArrayReverse {
    public static void main(String[] args) {
        int[] array= {323,43,56,7,7,8,9,999,6,6777,8,3};
        for (int i = 0, j = array.length -1; i < j; i++,j--) {
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;

        }
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
    }
}
