package homework3.ex2.components;

public class Cpu {
    private int countCpu;
    private int mhz;

    public Cpu(int countCpu, int mhz) {
        this.countCpu = countCpu;
        this.mhz = mhz;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "countCpu=" + countCpu +
                ", mhz=" + mhz +
                '}';
    }
}
