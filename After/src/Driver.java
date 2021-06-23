/*
Dependency Inversion Principle
Entities must depend on abstractions, not on concretions. It states that the high-level module must not depend on the low-level module, but they should depend on abstractions.
*/

public class Driver {

    private Vehicle vehicle;

    public Driver(final Vehicle vehicle){// Loosely coupled... removed dependency of creating new instance
        this.vehicle = vehicle;
    }

    public void increaseSpeed(){
        vehicle.accelerate();
    }
}