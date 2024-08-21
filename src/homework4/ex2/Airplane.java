package homework4.ex2;

public class Airplane implements Flyable {
    private int countPassengers;

    @Override
    public void fly() throws FlyException {
        if (this.countPassengers < 0) {
            throw new FlyException("Ошибка: Количество пассажиров меньше 0");
        } else {
            System.out.println("Самолёт летит!");
        }
    }

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }
}
