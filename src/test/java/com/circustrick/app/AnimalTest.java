package com.circustrick.app;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    @Test
    void canCreateAnimal(){
        Animal animal = new Animal();
        Assertions.assertThat(animal).isNotNull();
    }

    @Test
    void animalCanDoATrick(){
        Animal animal = new Animal();
        Assertions.assertThat(animal.doTrick()).isTrue();
    }

    @Test
    void givenAnAnimalDoTheTrick_then_theTrickIsDone(){
        Animal animal = new Animal();
        animal.doTrick();
        Assertions.assertThat(animal.isTrickDone()).isTrue();
    }
}
