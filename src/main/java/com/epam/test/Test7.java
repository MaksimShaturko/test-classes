package com.epam.test;

class ParentTest7{
    int parentCount;
    int parentX;
}


public class Test7 extends ParentTest7{

    Test7 t = new Test7(){


        {int d = 15;}

    };

    int count;
    int x;
    static int r;
    protected static int s;

    public static void main(String[] args) {
        Test7.NestedTest7 en = new ExNested();
        en.sss();
    }

    public void m(){
        r = new InnerTest7().innerCount;
    }

    class InnerTest7{

        private final static int IIX = 10;
        private int innerCount;
        public void method(){
            Test7.this.count = 20;
            Test7.super.parentCount = 30;
        }

    }

    static class NestedTest7{

        public void sss(){
            System.out.println("s = " + s);
        }

    }
}

class ExNested extends Test7.NestedTest7{

}
