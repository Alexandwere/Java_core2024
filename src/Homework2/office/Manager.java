package Homework2.office;

public class Manager{
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(this.name + " (менеджер) : Я ничего не успеваю, помогите!");
    }

    public String getName() {
        return name;
    }
}
