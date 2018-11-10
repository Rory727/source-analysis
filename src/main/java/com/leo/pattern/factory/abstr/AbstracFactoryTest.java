package com.leo.pattern.factory.abstr;

public class AbstracFactoryTest {
    public static void main(String[] args) {
        PhoneFactory factory = new PhoneFactory();
        System.out.println(factory.getNokia());
    }
}
