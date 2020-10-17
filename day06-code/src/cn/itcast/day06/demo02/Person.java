package cn.itcast.day06.demo02;

/**
 * @author 17764
 */
public class Person {
    private String name;

    public Person(){
        System.out.println("assess");
    }
    public Person(String name){
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(String name){
        System.out.println(name + " ,hello,I'm " + this.name);
    }
}
