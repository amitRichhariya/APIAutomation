package com.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
        Airtel airtel =context.getBean("airtel",Airtel.class);
        airtel.callService();

        Jio jio = context.getBean("jio",Jio.class);
        jio.callService();
    }
}
