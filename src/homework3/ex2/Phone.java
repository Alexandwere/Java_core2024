package homework3.ex2;

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
