package homework2.office;

public class Runner {
    public static void main(String[] args) {
        Boss boss = new Boss("Петр Николаевич");
        Manager manager = new Manager("Володя");
        Secretary secretary = new Secretary("Секретарь");
        Guardian guardian = new Guardian("Петрович");

        Office office = new Office(boss, manager, secretary, guardian);
        office.workDay();
    }
}
