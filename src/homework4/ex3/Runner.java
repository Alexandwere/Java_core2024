package homework4.ex3;

import homework4.ex3.people.Builder;
import homework4.ex3.people.Driver;
import homework4.ex3.people.Human;

public class Runner {
    public static void main(String[] args) {
        Speakable human = new Human();
        Speakable builder = new Builder();
        Speakable driver = new Driver();
        Speakable bird = new Bird();

        Speakable[] people = {human, builder, driver, bird};
        for (Speakable body : people) {
            body.speak();
        }
    }
}
