package homework4.ex1;

public class PassengerCar extends Car {
    private final boolean hasCruiseControl;

    public PassengerCar(boolean isClean, double width, double high, double length, boolean hasCruiseControl) {
        super(isClean, width, high, length);
        this.hasCruiseControl = hasCruiseControl;
    }

    public PassengerCar(double width, double high, double length, boolean hasCruiseControl) {
        super(width, high, length);
        this.hasCruiseControl = hasCruiseControl;
    }
}
