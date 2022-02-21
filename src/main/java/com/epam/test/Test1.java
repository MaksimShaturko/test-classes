package com.epam.test;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        Test1 test = new Test1();
        test.m(5,7,10);
    }
    public void m(Integer ... var){
        System.out.println(Arrays.toString(var));

    }
}
