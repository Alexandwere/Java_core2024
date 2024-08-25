package homework4.text2.ex2;

public class Duck extends AllFly implements Flyable {
    private boolean isInjured;


    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
        flying[irk] = this;
        irk++;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }

    @Override
    public void fly() throws FlyException {
        if (isInjured) {
            throw new FlyException("Ошибка: Утка ранена, не полетит!");
        } else {
            System.out.println("Утка летит!");
        }
    }
}
