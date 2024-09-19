package edu.utdallas.cs2336;

public class CallbackImpl implements Callback {

    private final int value;

    public CallbackImpl(int value) {
        this.value = value;
    }

    @Override
    public int callbackHappened() {
        return value;
    }
}
