package com.epam.test;

public class Test5 {
    static {
        System.out.println("static block in Test5");
    }

    {
        System.out.println("logic block in Test5");
    }

    Test5(){
        System.out.println("Constructor Test5");
    }

    public static void main(String[] args) {
        B5 b = new B5();
        B5 b2 = new B5();
    }
}

class A5 extends Test5{
    static {
        System.out.println("static block in A5");
    }

    {
        System.out.println("logic block in A5");
    }

    A5(){
        System.out.println("Constructor A5");
    }
}

class B5 extends A5{
    static {
        System.out.println("static block in B5");
    }

    {
        System.out.println("logic block in B5");
    }

    B5(){
        System.out.println("Constructor B5");
    }
}
