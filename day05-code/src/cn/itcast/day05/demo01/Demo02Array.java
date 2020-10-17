package cn.itcast.day05.demo01;

import java.util.Arrays;

/**
 * @author 17764
 */
public class Demo02Array {
    public static void main(String[] args) {
        int[] ArrayA = new int[4];
        int[] ArrayB = new int[]{2,3,45,67,777};
        String[] arrayC = new String[]{"Hello","world","java"};
        System.out.println(arrayC.length);
        System.out.println(arrayC.toString());
        System.out.println(Arrays.toString(arrayC));
        int[] arrayD = {2,3,4,5,};
        System.out.println(Arrays.toString(arrayD));
        
    }
}
