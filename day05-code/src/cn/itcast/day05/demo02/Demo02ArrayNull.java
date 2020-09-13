package cn.itcast.day05.demo02;
/*
*所有引用类型变量都可以赋值为null
* 数组空指针异常 NullPointerException
 */
public class Demo02ArrayNull {
    public static void main(String[] args) {
        int[] Array = null;
//        Array = new int[3];
        System.out.println(Array[0]);
    }
}
