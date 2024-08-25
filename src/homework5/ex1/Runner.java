package homework5.ex1;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        String[] countries = {"Россия", "Франция", "Китай", "Япония", "Турция"};
        String filename = "donation.csv";

        BigDecimal[] donations = new BigDecimal[countries.length];
        for (int i = 0; i < countries.length; i++) {
            donations[i] = BigDecimal.ZERO;
        }

        Scanner scanner = new Scanner(Runner.class.getClassLoader().getResourceAsStream(filename));

        while (scanner.hasNextLine()) {
            String fragment = scanner.nextLine();
            try {
                for (int i = 0; i < countries.length; i++) {
                    if (fragment.contains(countries[i])) {
                        String oneDonat = (fragment
                                .replace(',', '.'))
                                .substring(fragment.indexOf(';') + 1);
                        donations[i] = donations[i].add(BigDecimal.valueOf(Double.parseDouble(oneDonat)));
                    }
                }
            } catch (NumberFormatException e) {
                scanner.nextLine();
            }
        }

        for (int i = 0; i < countries.length; i++) {
            System.out.println((countries[i]) + " - " + donations[i]);
        }
        scanner.close();
    }
}

