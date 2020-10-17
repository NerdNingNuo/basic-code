package cn.itcast.day05.demo02;

import java.util.Arrays;

public class Demo08ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(236,431,523);
        System.out.println(Arrays.toString(result));
    }
    public static int[] calculate(int a, int b, int c){
        int[] array = new int[2];
        array[0] = a + b + c;
        array[1] = array[0] / 3;
        return array;
    }
}
