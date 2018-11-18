package com.leo.pattern.singleton.lazy;

//双重检查锁
//依然性能问题
public class LazyThree {
    private LazyThree() {
    }

    // 使用volatile 保证 error处 可能的error
    private static volatile LazyThree instance;

    public static synchronized LazyThree getInstance() {
        if (instance == null) {
            synchronized (LazyThree.class) {
                if (instance == null) {
                    instance = new LazyThree(); // error
                }
            }
        }
        return instance;
    }
}
