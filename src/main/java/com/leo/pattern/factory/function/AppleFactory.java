package com.leo.pattern.factory.function;


import com.leo.pattern.factory.Apple;
import com.leo.pattern.factory.Phone;

public class AppleFactory implements Factory {
    @Override
    public Phone getPhone() {

        return new Apple();
    }
}
