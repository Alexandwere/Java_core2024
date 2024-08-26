package homework5.ex2.computer;

import homework5.ex2.User;

import java.io.IOException;
import java.util.Scanner;

public class Computer {
    protected String activeUser;
    protected Scanner scanner = new Scanner(System.in);
    protected String text;

    public void logIn(User user) throws IOException {
        this.activeUser = user.getUsername();
    }

    public void logOut() throws IOException {
        this.activeUser = null;
    }

    public void message() throws IOException {
        System.out.println("Введите сообщение!");
        this.text = scanner.nextLine();
        System.out.println("Сообщение: " + text);
    }
}
