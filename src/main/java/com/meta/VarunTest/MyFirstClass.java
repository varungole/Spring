package com.meta.VarunTest;


public class MyFirstClass {
    
    public String myVar;

    public MyFirstClass(String myVar)
    {
        this.myVar = myVar;
    }

    public String sayHello() {
        return "Hello from the first class " + myVar;
    }
}
