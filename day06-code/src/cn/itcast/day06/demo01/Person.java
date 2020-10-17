package cn.itcast.day06.demo01;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100){
            this.age = age;
        }else {
            System.out.println("请输入正确年龄");
        }

    }

    public void  show(){
        System.out.println("我叫"+name+"年龄"+age);
    }
}
