package com.leo.pattern.factory.sample;

import com.leo.pattern.factory.Phone;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory =  new SimpleFactory();

        Phone phone = factory.getPhone("apple");
        System.out.println(phone.getName());
    }
}
