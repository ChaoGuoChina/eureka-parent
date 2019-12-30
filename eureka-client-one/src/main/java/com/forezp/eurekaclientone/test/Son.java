package com.forezp.eurekaclientone.test;

import jdk.internal.dynalink.support.Lookup;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class Son extends Father {
    public void thinking(){
        System.out.println("I am Son!");
        try {
            MethodType mt = MethodType.methodType(void.class);
//            lookup.findOwnSpecial("GrandFather","thinking",mt.getClass());
//            Lookup.
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Son().thinking();
    }
}
