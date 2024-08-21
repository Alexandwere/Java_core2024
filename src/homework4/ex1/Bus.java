package homework4.ex1;

public class Bus extends Car {
    private final int maxPassengers;

    public Bus(boolean isClean, double width, double high, double length, int maxPassengers) {
        super(isClean, width, high, length);
        this.maxPassengers = maxPassengers;
    }

    public Bus(double width, double high, double length, int maxPassengers) {
        super(width, high, length);
        this.maxPassengers = maxPassengers;
    }
}
