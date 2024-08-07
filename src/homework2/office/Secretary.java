package homework2.office;

public class Secretary {
    private String name;

    public Secretary(String name) {
        this.name = name;
    }

    public void speak(String bossName, String managerName, String securityName) {
        System.out.println(this.name + ": " + bossName + ", не волнуйтесь, " + managerName +
                " все успеет. " + securityName + ", подождите!");
    }
}
