package cn.kgc.demo;

/**
 *
 *
 * 注意：
 *     1.无参构造默认就有 ，不需要手动添加
 *     2.有需要生成有参方法
 *
 * @program: day07->Dog
 * @description:
 * @author:
 * @create: 2020-02-13 16:15
 **/
public class Dog {
    //成员变量
    String name;
    int weight;
    //构造方法  带参数
    public Dog(String name, int weight) {
        this.name = name;
        //this ：当前对象
        this.weight = weight;
    }

    /**
     * 方法重载：
     *      1.同一个类中
     *      2.方法名相同
     *      3.参数的个数不同或类型不同
     *      4.与返回值，修饰符无关
     * @param weight
     * @param name
     */
    public Dog( int weight,String name) {
        this.name = name;
        //this ：当前对象
        this.weight = weight;
    }


    //无参构造
    public Dog() {
    }

    public void test(String password,int price){
        System.out.println("我是个方法");
    }
    public void test(String password,int price,int dd){
        System.out.println("我是个方法");
    }
}
