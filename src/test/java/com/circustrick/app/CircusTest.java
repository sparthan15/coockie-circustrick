package com.circustrick.app;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircusTest {

    Circus circus = Circus.create();

    @Test
    void canCreateCircus() {

        Assertions.assertThat(circus).isNotNull();
    }

    @Test
    void circusMustHaveAListOfAnimalsEmptyByDefault() {
        Assertions.assertThat(circus.getAnimals()).isEmpty();
    }

    @Test
    void circusBlowAWhistleAndLionDoTheTrick() {
        circus.getAnimals().add(new Lion());
        circus.blowWhistle();
        long totalAnimalsWithTrickDone = circus.getAnimals()
                .stream()
                .filter(a -> a.isTrickDone())
                .count();
        Assertions.assertThat(totalAnimalsWithTrickDone).isEqualTo(circus.getAnimals().size());
    }
}
