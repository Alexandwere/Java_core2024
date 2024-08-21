package homework4.ex4.herbivore;

import homework4.ex4.NotAliveException;

public class Elephant extends Herbivore {
    public Elephant(boolean isAlive, double weight) {
        super(isAlive, weight);
    }

    @Override
    public void run() throws NotAliveException {
        if (this.isAlive()) {
            System.out.println("Слон медленно бежит.");
        } else {
            throw new NotAliveException("Животное не может бегать!");
        }
    }
}
