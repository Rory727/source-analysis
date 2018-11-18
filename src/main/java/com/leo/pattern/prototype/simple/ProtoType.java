package com.leo.pattern.prototype.simple;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ProtoType implements Cloneable {

    private String name;
    private List list = new ArrayList();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
