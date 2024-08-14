package homework3.ex2.factories;

import homework3.ex2.components.Camera;
import homework3.ex2.components.Case;
import homework3.ex2.components.Cpu;
import homework3.ex2.phones.Samsung;

public class SamsungFactory {
    public static Samsung makePhone(){
        Camera samCamera = new Camera(16);
        Case samCase = new Case(60, 200, 15);
        Cpu samCpu = new Cpu(1, 1500);

        Samsung samsung = new Samsung(samCamera, samCase, samCpu);
        return samsung;
    }
}
