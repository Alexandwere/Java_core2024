package homework3.ex2.phones;

import homework3.ex2.components.Camera;
import homework3.ex2.components.Case;
import homework3.ex2.components.Cpu;

public abstract class Phone {
    Camera camera;
    Case aCase;
    Cpu cpu;
    public Phone(Camera camera, Case aCase, Cpu cpu) {
        this.camera = camera;
        this.aCase = aCase;
        this.cpu = cpu;
    }
    public void photo(){
        Camera.photo();
    }
}
