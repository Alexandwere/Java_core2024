package Homework2.office;

public class Boss {
    //Босс обладает именем. Умеет подгонять менеджера - "{Имя менеджера}" быстрее!
    private String name;

    public Boss(String name) {
        this.name = name;
    }

    public void speak(String managerName) {
        System.out.println(this.name + " (босс): " + managerName + " ,быстрее!");
    }

    public String getName() {
        return name;
    }
}