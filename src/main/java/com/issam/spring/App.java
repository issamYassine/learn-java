package com.issam.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by user on 10/11/2015.
 */
public class App {
    public static void main(String[]args){
        ApplicationContext Context = new FileSystemXmlApplicationContext("bean");
        Person person = (Person)Context.getBean("person");
        person.Speak();
    }
}
