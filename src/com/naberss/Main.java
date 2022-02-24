package com.naberss;

import com.naberss.proxyHandler.LogExecutionTimeProxy;
import com.naberss.interfaces.ServiceOne;
import com.naberss.realObject.ServiceOneBean;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //Creating Target instance
        ServiceOne serviceOne = new ServiceOneBean();

        ServiceOne proxy = (ServiceOne) Proxy.newProxyInstance(ServiceOne.class.getClassLoader(),
                                                               new Class[]{ServiceOne.class},
                                                               new LogExecutionTimeProxy(serviceOne));

        String result = proxy.sayHello();
        System.out.println(result);

        String result2 = proxy.sayBye();
        System.out.println(result2);

    }
}
