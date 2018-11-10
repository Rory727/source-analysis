package com.leo.pattern.factory.abstr;

import com.leo.pattern.factory.*;

public class PhoneFactory extends AbstractFactory {
    @Override
    public Phone getApple() {
        return new Apple();
    }

    @Override
    public Phone getHuawei() {
        return new Huawei();
    }

    @Override
    public Phone getSamsung() {
        return new Samsung();
    }

    @Override
    public Phone getNokia() {
        return new Nokia();
    }
}
