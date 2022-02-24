package com.naberss.realObject;

import com.naberss.interfaces.ServiceOne;

public class ServiceOneBean implements ServiceOne {

    @Override
    public String sayHello() {
        System.out.println("executing stuff");
        return "hello";
    }

    @Override
    public String sayBye() {
        System.out.println("executing stuff again");
        return "bye";
    }

    public String sayTeste() {
        System.out.println("executing teste");
        return "teste";
    }
}
