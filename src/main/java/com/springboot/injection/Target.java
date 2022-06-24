package com.springboot.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

public class Target {
    private Foo fooOne;
    private Foo foo2;
    private Bar bar;
    private Foo fooTwo;

    public Target() {
    }

    public Target(Foo fooOne) {
        this.fooOne = fooOne;
    }

    public Target(Foo foo, Bar bar){
        System.out.println("foo and bar called");
    }

    public Foo getFooOne() {
        return fooOne;
    }

    public void setFooOne(Foo fooOne) {
        this.fooOne = fooOne;
        System.out.println("Property fooOne set");
    }

    public Foo getFoo2() {
        return foo2;
    }

    public void setFoo2(Foo foo2) {
        this.foo2 = foo2;
        System.out.println("Property fooTwo set");
    }

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
        System.out.println("Property bar set");
    }

    public Foo getFooTwo() {
        return fooTwo;
    }

    public void setFooTwo(Foo fooTwo) {
        this.fooTwo = fooTwo;
        System.out.println("Property fooTwo2 set");
    }
}
