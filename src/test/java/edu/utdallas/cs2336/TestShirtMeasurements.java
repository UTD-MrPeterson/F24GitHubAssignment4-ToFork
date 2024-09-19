package edu.utdallas.cs2336;

import org.junit.jupiter.api.Test;

public class TestShirtMeasurements {

    @Test
    public void testSetup() {
        ShirtMeasurements shirtMeasurements = new ShirtMeasurements(Units.INCHES, 16, 35, 40);
        assert(Units.INCHES == shirtMeasurements.getUnits());
        assert(16 == shirtMeasurements.getNeck());
        assert(35 == shirtMeasurements.getArms());
        assert(40 == shirtMeasurements.getChest());

        shirtMeasurements = new ShirtMeasurements(Units.CENTEMETERS, 40, 85, 100);
        assert(Units.CENTEMETERS == shirtMeasurements.getUnits());
        assert(40 == shirtMeasurements.getNeck());
        assert(85 == shirtMeasurements.getArms());
        assert(100 == shirtMeasurements.getChest());
    }

    @Test
    public void testMutation() {
        ShirtMeasurements growingPerson = new ShirtMeasurements(Units.INCHES, 16, 33, 35);
        growingPerson.setNeck(17);
        assert(17 == growingPerson.getNeck());
        growingPerson.setArms(37);
        assert(37 == growingPerson.getArms());
        growingPerson.setChest(42);
        assert(42 == growingPerson.getChest());
    }

    @Test
    public void testCombined() {
        ShirtMeasurements shirtMeasurements = new ShirtMeasurements(Units.CENTEMETERS, 41, 84, 99);
        assert(224 == shirtMeasurements.combined());
        shirtMeasurements.setNeck(40);
        assert(223 == shirtMeasurements.combined());
        shirtMeasurements.setArms(86);
        assert(225 == shirtMeasurements.combined());
        shirtMeasurements.setChest(95);
        assert(221 == shirtMeasurements.combined());
    }

    @Test
    public void testConversion() {
        ShirtMeasurements shirtMeasurements = new ShirtMeasurements(Units.CENTEMETERS, 39, 83, 101);
        assert(39.0 == shirtMeasurements.getNeck(Units.CENTEMETERS));
        assert(0.001 > Math.abs(shirtMeasurements.getNeck(Units.INCHES) - (39 / 2.54)));
        assert(83.0 == shirtMeasurements.getArms(Units.CENTEMETERS));
        assert(0.001 > Math.abs(shirtMeasurements.getArms(Units.INCHES) - (83 / 2.54)));
        assert(101.0 == shirtMeasurements.getChest(Units.CENTEMETERS));
        assert(0.001 > Math.abs(shirtMeasurements.getChest(Units.INCHES) - (101 / 2.54)));

        shirtMeasurements = new ShirtMeasurements(Units.INCHES, 15, 33, 32);
        assert(15.0 == shirtMeasurements.getNeck(Units.INCHES));
        assert(0.001 > Math.abs(shirtMeasurements.getNeck(Units.CENTEMETERS) - (15 * 2.54)));
        assert(33.0 == shirtMeasurements.getArms(Units.INCHES));
        assert(0.001 > Math.abs(shirtMeasurements.getArms(Units.CENTEMETERS) - (33 * 2.54)));
        assert(32.0 == shirtMeasurements.getChest(Units.INCHES));
        assert(0.001 > Math.abs(shirtMeasurements.getChest(Units.CENTEMETERS) - (32 * 2.54)));
    }
}
