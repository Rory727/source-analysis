package com.leo.pattern.factory.sample;

import com.leo.pattern.factory.Apple;
import com.leo.pattern.factory.Huawei;
import com.leo.pattern.factory.Phone;
import com.leo.pattern.factory.Samsung;

public class SimpleFactory {
   public Phone getPhone(String name){
       if ("apple".equalsIgnoreCase(name)){
           return new Apple();
       }else if ("samsung".equalsIgnoreCase(name)){
           return new Samsung();
       }else if ("huawei".equalsIgnoreCase(name)){
           return new Huawei();
       }else{
           System.out.println("There is not the product!");
           return null;
       }
   }
}
