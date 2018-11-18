package com.leo.pattern.singleton.seriable;

import java.io.Serializable;

public class Seriable implements Serializable {
    private Seriable() {
    }

    public static final Seriable INSTANCE = new Seriable();

    public static Seriable getInstance() {
        return INSTANCE;
    }

    // 解决 反序列化 的重复创建,保证单例 共享锁机制
    private Object readResolve() {
        return INSTANCE;
    }
}
