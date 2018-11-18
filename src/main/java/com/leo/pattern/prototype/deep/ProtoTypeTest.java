package com.leo.pattern.prototype.deep;

public class ProtoTypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Teach t1 = new Teach();
        Teach t2 = (Teach) t1.clone();
        System.out.println(t1.stu == t2.stu);
    }
}
