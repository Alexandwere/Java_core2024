package homework4.ex4;

import homework4.ex4.herbivore.Elephant;
import homework4.ex4.herbivore.Rabbit;
import homework4.ex4.predator.Tiger;
import homework4.ex4.predator.Wolf;

public class Runner {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(true, 300);
        Wolf wolf = new Wolf(true, 50);
        Rabbit rabbit = new Rabbit(true, 2);
        Elephant elephant = new Elephant(true, 2000);

        try {
            rabbit.run();
        } catch (NotAliveException e) {
            System.out.println(e.getMessage());
        }

        try {
            wolf.attack(rabbit);
        } catch (NotAliveException e) {
            System.out.println(e.getMessage());
        }

        try {
            tiger.attack(wolf);
        } catch (NotAliveException e) {
            System.out.println(e.getMessage());
        }

        try {
            elephant.run();
        } catch (NotAliveException e) {
            System.out.println(e.getMessage());
        }

        try {
            rabbit.run();
        } catch (NotAliveException e) {
            System.out.println(e.getMessage());
        }
    }
}
