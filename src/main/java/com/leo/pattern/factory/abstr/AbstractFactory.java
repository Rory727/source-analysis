package com.leo.pattern.factory.abstr;

import com.leo.pattern.factory.Phone;

public abstract class AbstractFactory {

    // 可以添加公共资源


    /**
     * get a Apple
     *
     * @return
     */
    public abstract Phone getApple();

    /**
     * get a Huawei
     *
     * @return
     */
    public abstract Phone getHuawei();

    /**
     * get a Samsung
     *
     * @return
     */
    public abstract Phone getSamsung();

    /**
     * get a Samsung
     *
     * @return
     */
    public abstract Phone getNokia();

}
