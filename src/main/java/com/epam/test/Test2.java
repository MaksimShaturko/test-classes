package com.epam.test;

public class Test2 {

    public static void main(String[] args) {
        A test = new A();

        test.m();
        test.m(5);
        test.m(5,7);

    }

    public final void t(){
        System.out.println("final t");
    }


    public static void m(){
        System.out.println("static m");
    }

    public void m(int x){
        System.out.println("m with x");
    }

}

class A extends Test2{

    public void m(int x, int y){
        System.out.println("m with x, y");
    }

//    public final void t(){
//        System.out.println("can't do that");
//    }



}

