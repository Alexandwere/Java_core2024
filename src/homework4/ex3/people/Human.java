package homework4.ex3.people;

import homework4.ex3.Speakable;

public class Human implements Speakable {
    @Override
    public void speak() {
        System.out.println("Я человек!");
    }
}
