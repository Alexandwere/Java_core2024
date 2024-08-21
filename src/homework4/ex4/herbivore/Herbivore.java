package homework4.ex4.herbivore;

import homework4.ex4.Live;
import homework4.ex4.NotAliveException;

public class Herbivore extends Live {

    public Herbivore(boolean isAlive, double weight) {
        super(isAlive, weight);
    }

    public void run() throws NotAliveException {
        if (!this.isAlive()) {
            throw new NotAliveException("Животное не может бегать!");
        }
    }
}
