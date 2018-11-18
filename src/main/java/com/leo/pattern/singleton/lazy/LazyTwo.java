package com.leo.pattern.singleton.lazy;

public class LazyTwo {
    private LazyTwo() {
    }

    private static LazyTwo lazyOne;

    public static synchronized LazyTwo getInstance() {
        if (lazyOne == null) {
            lazyOne = new LazyTwo();
        }
        return lazyOne;
    }
}
