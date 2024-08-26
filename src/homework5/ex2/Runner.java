package homework5.ex2;

import homework5.ex2.computer.Computer;
import homework5.ex2.computer.SpyComputer;

import java.io.IOException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Computer computer = new Computer();
        SpyComputer spyComputer = new SpyComputer(computer);
        System.out.println("Введите имя пользователя!");
        String username = scanner.nextLine();
        User user1 = new User(username);
        spyComputer.logIn(user1);
        spyComputer.message();
        spyComputer.logOut();
    }
}
