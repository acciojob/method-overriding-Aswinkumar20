package com.driver;

public class Main {


    public static void main(String[] args) {
        A ob = new B();
        System.out.println(ob.meth());

    }

    static class A{

        public String meth() {
            return "Invoking method from class A";
        }
    }

    static class  B extends A{
//        A obj1= new B;
//        String ans  = obj1.meth();

        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }
}

