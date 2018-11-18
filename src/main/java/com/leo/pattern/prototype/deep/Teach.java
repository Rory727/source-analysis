package com.leo.pattern.prototype.deep;

import java.io.*;

public class Teach extends Person implements Cloneable,Serializable {
    public Student stu;
    public int sn;

    public Teach() {
        this.sn = 2;
        this.stu = new Student();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    private Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Person p = (Person) ois.readObject();
            return p;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
