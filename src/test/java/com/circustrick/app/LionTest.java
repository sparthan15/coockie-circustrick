package com.circustrick.app;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LionTest {
    Animal lion = new Lion();
    @Test
    void canCreateLion(){

        Assertions.assertThat(lion).isNotNull();
        Assertions.assertThat(lion.isTrickDone()).isFalse();
    }

    @Test
    void lionRoarsForTrick(){
        Assertions.assertThat(lion.doTrick()).isTrue();
    }

}
