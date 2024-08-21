package homework4.ex3.people;

public class Builder extends Human {
    @Override
    public void speak() {
        System.out.print("Я строитель! ");
        super.speak();
    }
}
