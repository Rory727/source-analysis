package com.leo.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {
    private BeanFactory() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className) {
        Object obj = null;
        if (ioc.containsKey(className)) {
            return ioc.get(className);
        } else {
            try {
                obj = Class.forName(className).newInstance();
                ioc.put(className, obj);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return obj;
    }

}
