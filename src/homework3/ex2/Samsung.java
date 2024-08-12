package homework3.ex2;

public class Samsung extends Phone {

    public Samsung(Camera camera, Case aCase, Cpu cpu) {
        super(camera, aCase, cpu);
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "camera=" + camera +
                ", aCase=" + aCase +
                ", cpu=" + cpu +
                '}';
    }
}