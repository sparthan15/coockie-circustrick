package com.circustrick.app;

public class CAt extends Animal{

    @Override
    public boolean doTrick(){
        System.out.println("Meow!");
        trickDone = true;
        return true;
    }

}
