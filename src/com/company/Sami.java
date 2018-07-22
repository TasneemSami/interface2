package com.company;

public class Sami implements Human {
    @Override
    public void sleep() {
        System.out.println("sleeps sound");
    }

    @Override
    public void eats() {
        System.out.println("yummy foods");
    }

    @Override
    public void runs() {
        System.out.println("very fast");
    }

    @Override
    public void works() {
        System.out.println("very hard");
    }

    @Override
    public void walks() {
        System.out.println("very slow");
    }
}
