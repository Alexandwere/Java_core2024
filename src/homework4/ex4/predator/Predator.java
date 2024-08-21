package homework4.ex4.predator;

import homework4.ex4.Live;
import homework4.ex4.NotAliveException;

public class Predator extends Live {
    public Predator(boolean isAlive, double weight) {
        super(isAlive, weight);
    }

    public void attack(Live prey) throws NotAliveException {
        if (this.isAlive()) {
            if (prey.getWeight() > this.getWeight()) {
                System.out.println("Хищник погиб.");
                this.setAlive(false);
            }
            this.setWeight(this.getWeight() + prey.getWeight() / 3);
            prey.setAlive(false);
            System.out.println("Хищник поел, теперь весит " + this.getWeight());
        } else {
            throw new NotAliveException("Животное не может нападать!");
        }
    }
}
