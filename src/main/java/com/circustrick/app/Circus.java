package com.circustrick.app;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Circus {

    private List<Animal> animals = new ArrayList<>();

    public static Circus create() {
        return new Circus();
    }

    public void blowWhistle() {
        animals.forEach(a -> a.doTrick());
    }
}
