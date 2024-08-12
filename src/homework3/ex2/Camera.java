package homework3.ex2;

public class Camera {
    private int megapixels;

    public Camera(int megapixels) {
        this.megapixels = megapixels;
    }

    public static void photo(){
        System.out.println("Сделано фото");
    }

    @Override
    public String toString() {
        return "Camera{" +
                "megapixels=" + megapixels +
                '}';
    }
}
