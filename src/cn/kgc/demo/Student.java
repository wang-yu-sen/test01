package cn.kgc.demo;

import java.util.Arrays;

/**
 * @program: day07->Student
 * @description:
 * @author:
 * @create: 2020-02-13 15:40
 **/
public class Student {
    public  int[] score(int[] scores){
        Arrays.sort(scores);
        for (int score : scores) {
            System.out.println(score);
        }
        return  scores;
    }


    public  String  piese(String falo){
        return  falo;
    }

}
