package com.leo.pattern.factory.function;

import com.leo.pattern.factory.Phone;

public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new HuaweiFactory();

        Phone phone = factory.getPhone();
        System.out.println(phone.getName());
    }
}
