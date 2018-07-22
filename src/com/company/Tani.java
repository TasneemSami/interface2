package com.company;

public class Tani implements Human{
    @Override
    public void sleep() {
        System.out.println("sleeps in the bus!");
    }

    @Override
    public void eats() {
        System.out.println("spice");
    }

    @Override
    public void runs() {
        System.out.println("fast");
    }

    @Override
    public void works() {
        System.out.println("hard");
    }

    @Override
    public void walks() {
        System.out.println("slow");
    }
}
