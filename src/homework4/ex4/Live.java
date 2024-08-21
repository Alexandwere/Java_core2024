package homework4.ex4;

public class Live {
    private boolean isAlive;
    private double weight;

    public void death() {
        this.isAlive = false;
    }

    public Live(boolean isAlive, double weight) {
        this.isAlive = isAlive;
        this.weight = weight;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public double getWeight() {
        return weight;
    }
}
