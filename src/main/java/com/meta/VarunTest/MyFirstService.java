package com.meta.VarunTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySources({ @PropertySource("classpath:custom.properties"),
                @PropertySource("classpath:custom2.properties")
})

public class MyFirstService {
    
    private final MyFirstClass myFirstClass;
    
    private final Environment environment;
    @Value("${my.prop}")
    private String customPropertyFromAnotherFile1;
    @Value("${my.prop.2}")
    private String customPropertyFromAnotherFile2;
    
    @Value("${my.custom.property}")
    private String customProperty;

    
    public String getCustomProperty() {
        return customProperty;
    }

    public String getCustomPropertyFromAnotherFile1() {
        return customPropertyFromAnotherFile1;
    }

    public String getCustomPropertyFromAnotherFile2() {
        return customPropertyFromAnotherFile2;
    }

    @Autowired
    public MyFirstService(@Qualifier("myFirstBean") MyFirstClass myFirstClass, Environment environment)
    {
        this.myFirstClass = myFirstClass;
        this.environment = environment;
    }

    public String tellAStory()
    {
         return "The dependency is saying" + myFirstClass.sayHello();
    }

    public String getJavaVersion()
    {
        return environment.getProperty("java.version");
    }

    public String readProp()
    {
        return environment.getProperty("my.custom.property");
    }
    
    
  
}
