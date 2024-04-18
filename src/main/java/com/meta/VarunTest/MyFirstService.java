package com.meta.VarunTest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    
    private MyFirstClass myFirstClass;
    
    public MyFirstService(@Qualifier("myFirstBean") MyFirstClass myFirstClass)
    {
        this.myFirstClass = myFirstClass;
    }

    public String tellAStory()
    {
         return "The dependency is saying" + myFirstClass.sayHello();
    }
}
