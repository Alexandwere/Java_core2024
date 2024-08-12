package homework3.ex2;

public class Case {
    private int width;
    private int height;
    private int length;

    public Case(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Case{" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                '}';
    }
}
