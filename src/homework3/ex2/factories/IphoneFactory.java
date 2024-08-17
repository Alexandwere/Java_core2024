package homework3.ex2.factories;

import homework3.ex2.components.Camera;
import homework3.ex2.components.Case;
import homework3.ex2.components.Cpu;
import homework3.ex2.phones.Iphone;
import homework3.ex2.phones.Samsung;

public class IphoneFactory {
    public static Iphone makePhone() {
        Camera iCamera = new Camera(8);
        Case iCase = new Case(60, 200, 10);
        Cpu iCpu = new Cpu(2, 1000);

        return new Iphone(iCamera, iCase, iCpu);
    }
}
