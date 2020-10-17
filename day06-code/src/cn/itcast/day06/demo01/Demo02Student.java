package cn.itcast.day06.demo01;

public class Demo02Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("sjjs");
        student.setAge(38);
        student.setMale(true);

        System.out.println("姓名" + student.getName() + "年龄" + student.getAge() + "性别" + student.isMale());
    }
}
