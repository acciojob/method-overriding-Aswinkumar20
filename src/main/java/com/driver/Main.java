package com.driver;

public class Main {

    public static class A {

        public String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        public B(){}


        @Override
        public String meth() {
            A obj =new A();
            obj.meth();
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {
        B b = new B();
        b.meth();
    }
}