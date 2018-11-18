package com.leo.pattern.singleton.hungry;

//饿汉式
public class Hungry {
    private Hungry() {
    }

    private static final Hungry hungry = new Hungry();

    public static Hungry getInstance() {
        return hungry;
    }
}
