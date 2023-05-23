package com.circustrick.app;

import lombok.Getter;

@Getter
public class Animal {

    protected boolean trickDone;

    public boolean doTrick() {
        this.trickDone = true;
        System.out.println("My trick is going crazy!!");
        return true;
    }
}
