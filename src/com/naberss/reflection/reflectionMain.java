package com.naberss.reflection;

import com.naberss.realObject.ServiceOneBean;

import java.lang.reflect.Method;

public class reflectionMain {
    public static void main(String[] args) {

        try {
            Class c = ServiceOneBean.class;
            Method m[] = c.getDeclaredMethods();

            for (Method node : m) {
                System.out.println(node.toString());
            }
        } catch (Throwable e) {
            System.err.println(e);
        }


    }
}
