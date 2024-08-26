package homework5.ex2.computer;

import homework5.ex2.User;

import java.io.FileWriter;
import java.io.IOException;

public class SpyComputer extends Computer {
    private final String projectPath = "C:\\Users\\lazuk\\IdeaProjects\\Java_core2024";
    private final String filename = "comp.log";
    private final String path = projectPath + "\\" + filename;
    private final Computer computer;

    public SpyComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void logIn(User user) throws IOException {
        super.logIn(user);
        addLog("Пользователь " + activeUser + " вошел\n");
    }

    @Override
    public void logOut() throws IOException {
        super.logOut();
        addLog("Пользователь вышел\n");
    }

    @Override
    public void message() throws IOException {
        super.message();
        addLog("Пользователь " + activeUser + " отправил сообщение \"" + text + "\"\n");
    }

    private void addLog(String textLog) throws IOException {
        try (FileWriter fileWriter = new FileWriter(path, true)) {
            fileWriter.write(textLog);
        }
    }

    public Computer getComputer() {
        return computer;
    }
}
