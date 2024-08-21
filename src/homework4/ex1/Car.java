package homework4.ex1;

public abstract class Car {
    private boolean isClean = false;
    private final double length;
    private final double high;
    private final double width;

    public boolean isClean() {
        return isClean;
    }

    public Car(double length, double high, double width) {
        this.length = length;
        this.high = high;
        this.width = width;
    }

    public Car(boolean isClean, double length, double high, double width) {
        this.isClean = isClean;
        this.length = length;
        this.high = high;
        this.width = width;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public double getWidth() {
        return width;
    }

    public double getHigh() {
        return high;
    }

    public double getLength() {
        return length;
    }
}
