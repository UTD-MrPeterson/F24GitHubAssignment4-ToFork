package edu.utdallas.cs2336;

import org.junit.jupiter.api.Test;

public class TestConcreteMath {
    @Test
    public void testArithmetic() {
        AbstractMath math = new ConcreteMath();
        assert (5 == math.incrementBy(5));
        assert (3 == math.decrementBy(2));
        assert (6 == math.multiplyBy(2));
        assert (3 == math.decrementBy(3));
        assert (27 == math.toThisPower(3));
    }

    @Test
    public void testEquality() {
        AbstractMath first = new ConcreteMath(5);
        AbstractMath second = new ConcreteMath(7);

        assert (first.lessThan(second));
        assert (!first.equals(second));
        assert (!first.greaterThan(second));

        assert (second.greaterThan(first));
        assert (!second.equals(first));
        assert (!second.lessThan(first));

        second.decrementBy(2);
        assert (first.equals(second));
        assert (!first.greaterThan(second));
        assert (!first.lessThan(second));
    }
}
