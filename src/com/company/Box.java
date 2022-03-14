package com.company;

import java.util.ArrayList;

public class Box <B> {
    private B variable;

    public Box(){}

    public Box(B variable) {
        this.variable = variable;
    }

    public static <B> void boxes(B boxes){
        ArrayList<B> box = new ArrayList<>();
        box.add((B) new Box<Integer>(13));
        System.out.println(box);
    }

    public B getVariable() {
        return variable;
    }

    public void setVariable(B variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return "Box{" +
                "variable=" + variable +
                '}';
    }
}
