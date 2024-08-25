package homework4.text2.ex2;

public class Runner {
    public static void main(String[] args) throws FlyException {
        Duck duck1 = new Duck(true);
        Duck duck2 = new Duck(false);
        Airplane airplane1 = new Airplane(10);
        Airplane airplane2 = new Airplane(-1);

        Flyable.check();
    }
}
