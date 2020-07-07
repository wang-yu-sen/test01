package cn.kgc.demo;

import javax.naming.Name;
import javax.xml.bind.PrintConversionEvent;

/**
 * @program: day07->MethodDemo
 * @description: ches
 * @author:
 * @create: 2020-02-13 15:24
 **/
public class MethodDemo {
    public static void main(String[] args) {
        int[] ss={56,55,78,98};
        Student q=new Student();
        q.score(ss);
         String name ;
         int avg;
         double price;
         test01("shansg",60,0);
    }



    public  static  void  test01(String name,int avg,double price){
        System.out.println("名字"+name+"员工年龄"+avg+"工时"+price);
    }



 }

