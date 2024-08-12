package homework3.ex2;

public class IphoneFactory {
    public static void makePhone() {
        Camera iCamera = new Camera(8);
        Case iCase = new Case(60, 200, 10);
        Cpu iCpu = new Cpu(2, 1000);

        Samsung samsung = new Samsung(iCamera, iCase, iCpu);
    }
}
