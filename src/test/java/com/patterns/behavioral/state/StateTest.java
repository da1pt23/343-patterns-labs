package com.patterns.behavioral.state;

import org.junit.jupiter.api.Test;

public class StateTest {

    @Test
    public void test() {
        RoomContext ctx = new RoomContext(null, "1");

        ctx.update();
        ctx.update();
        ctx.update();
    }

}