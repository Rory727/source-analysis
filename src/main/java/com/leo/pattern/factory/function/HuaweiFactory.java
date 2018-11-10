package com.leo.pattern.factory.function;

import com.leo.pattern.factory.Huawei;
import com.leo.pattern.factory.Phone;

public class HuaweiFactory implements Factory {
    @Override
    public Phone getPhone() {
        return new Huawei();
    }
}
