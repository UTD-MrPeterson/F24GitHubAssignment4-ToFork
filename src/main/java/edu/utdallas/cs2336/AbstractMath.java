package edu.utdallas.cs2336;

public abstract class AbstractMath {
    protected int runningTotal;

    public AbstractMath(int initialValue) {
        runningTotal = initialValue;
    }

    public int incrementBy(int value) {
        runningTotal += value;
        return runningTotal;
    }

    public abstract int decrementBy(int value);

    public abstract int multiplyBy(int value);

    public abstract int toThisPower(int value);

    public abstract boolean greaterThan(AbstractMath other);

    public abstract boolean lessThan(AbstractMath other);
}
