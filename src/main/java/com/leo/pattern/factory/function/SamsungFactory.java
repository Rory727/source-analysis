package com.leo.pattern.factory.function;

import com.leo.pattern.factory.Phone;
import com.leo.pattern.factory.Samsung;

public class SamsungFactory implements Factory {
    @Override
    public Phone getPhone() {
        return new Samsung();
    }
}
