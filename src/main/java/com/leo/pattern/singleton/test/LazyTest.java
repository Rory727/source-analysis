package com.leo.pattern.singleton.test;

import com.leo.pattern.singleton.lazy.LazyFour;

import java.lang.reflect.Constructor;

public class LazyTest {
    public static void main(String[] args) {
        Class<?> clazz = LazyFour.class;
        try {

            Constructor c = clazz.getDeclaredConstructor();
            c.setAccessible(true);
            Object o1 = c.newInstance();
            Object o2 = c.newInstance();
            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
