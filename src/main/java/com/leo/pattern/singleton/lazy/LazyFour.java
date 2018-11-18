package com.leo.pattern.singleton.lazy;

//利用内部类的加载特性
//避免 性能问题 和 安全问题
public class LazyFour {
    //防止强力创建 依然有风险
    private static boolean initialized = false;

    private LazyFour() {
        synchronized (LazyFour.class) {
            if (initialized == false) {
                initialized = !initialized;
            } else {
                throw new RuntimeException("强力反射创建单例");
            }
        }
    }

    public static final LazyFour getInstance() {
        return LazyHolder.instance;
    }

    private static class LazyHolder {
        private static final LazyFour instance = new LazyFour();
    }
}
