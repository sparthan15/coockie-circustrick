package com.circustrick.app;

public class Lion extends Animal{

    @Override
    public boolean doTrick(){
        System.out.println("I'm Roaring !");
        trickDone = true;
        return true;
    }
    public void jump(){

    }
}
