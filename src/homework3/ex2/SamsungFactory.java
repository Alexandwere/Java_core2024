package homework3.ex2;

public class SamsungFactory {
    public static Samsung makePhone(){
        Camera samCamera = new Camera(16);
        Case samCase = new Case(60, 200, 15);
        Cpu samCpu = new Cpu(1, 1500);

        Samsung samsung = new Samsung(samCamera, samCase, samCpu);
        return samsung;
    }
}
