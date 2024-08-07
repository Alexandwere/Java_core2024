package homework2.office;

public class Guardian {
    private String name;

    public Guardian(String name) {
        this.name = name;
    }

    public void speak(){
        System.out.println(this.name + " (охранник): Выдайте мне аванс!");
    }

    public String getName() {
        return name;
    }
}
