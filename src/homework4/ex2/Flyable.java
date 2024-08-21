package homework4.ex2;

public interface Flyable {
    void fly() throws FlyException;

    static void check(Flyable[] flying) {
        for (Flyable ex : flying) {
            try {
                ex.fly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
