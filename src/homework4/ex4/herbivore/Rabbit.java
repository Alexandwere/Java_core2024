package homework4.ex4.herbivore;

import homework4.ex4.NotAliveException;

public class Rabbit extends Herbivore {
    public Rabbit(boolean isAlive, double weight) {
        super(isAlive, weight);
    }

    @Override
    public void run() throws NotAliveException {
        if (this.isAlive()) {
            System.out.println("Кролик быстро бежит.");
        } else {
            throw new NotAliveException("Животное не может бегать!");
        }
    }
}
