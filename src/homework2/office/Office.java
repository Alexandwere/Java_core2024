package homework2.office;

public class Office {

    Boss boss;
    Manager manager;
    Secretary secretary;
    Guardian guardian;

    public Office(Boss boss, Manager manager, Secretary secretary, Guardian guardian) {
        this.boss = boss;
        this.manager = manager;
        this.secretary = secretary;
        this.guardian = guardian;
    }
     public void workDay(){
        boss.speak(manager.getName());
        manager.speak();
        guardian.speak();
        secretary.speak(boss.getName(), manager.getName(), guardian.getName());
     }
}
