package edu.utdallas.cs2336;

import org.junit.jupiter.api.Test;

public class TestCallbacker {

    @Test
    public void testCallbacks() {
        Callback first = new CallbackImpl(5);
        Callback second = new CallbackImpl(3);
        Callback third = new CallbackImpl(7);

        Callbacker callbacker = new Callbacker(first);
        assert(5 == callbacker.doCallbacks());

        callbacker.addCallback(second);
        assert(8 == callbacker.doCallbacks());

        callbacker.removeCallback(first);
        assert(3 == callbacker.doCallbacks());

        callbacker.addCallback(third);
        assert(10 == callbacker.doCallbacks());

        callbacker.addCallback(first);
        assert(15 == callbacker.doCallbacks());
    }
}
