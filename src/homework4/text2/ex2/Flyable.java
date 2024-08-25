package homework4.text2.ex2;

public interface Flyable {
    void fly() throws FlyException;

    static Flyable[] flying = {};

//        for (int i = 0; i <= flying.length; i++) {
//            flying[i] = body;
//        }
    static void check(){
        for (Flyable ex : flying){
            try {
                ex.fly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
