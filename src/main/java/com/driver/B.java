package com.driver;

public class  B extends A{

    public B(){}
//
//    A obj1= new B();
//    String ans  = obj1.meth();

    @Override
    public String meth() {
        A obj1= new A();
        String ans  = obj1.meth();
        System.out.println(ans);
        return "Method is overridden in Extendend class B";
    }
}