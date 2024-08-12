package homework3.ex3;

public class Pyramid1 extends Pyramid2 {
    public String line = "M";

    @Override
    public void print() {
        System.out.println(line);
        super.print();
    }
}
