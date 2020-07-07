package cn.kgc.demo;

/**
 * @program: day07->DogDemo
 * @description:
 * @author:
 * @create: 2020-02-13 16:27
 **/
public class DogDemo {
    public static void main(String[] args) {
        //编译时报错
       Dog ss=  new Dog("大黄",2);
        ss.name="大黄";
        ss.weight=2;
        System.out.println("ss.name = " + ss.name);
        System.out.println("ss.weight = " + ss.weight);
    }
}
