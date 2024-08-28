package homework5.ex1;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        String[] countries = {"Россия", "Франция", "Китай", "Япония", "Турция"};
        String filename = "donation.csv";

        BigDecimal[] donations = new BigDecimal[countries.length];
        for (int i = 0; i < countries.length; i++) {
            donations[i] = BigDecimal.ZERO;
        }

        Scanner scanner = new Scanner(Runner.class.getClassLoader().getResourceAsStream(filename));

        while (scanner.hasNext()) {
            String fragment = scanner.nextLine();
            for (int i = 0; i < countries.length; i++) {
                if (fragment.contains(countries[i])) {
                    String oneDonat = (fragment
                            .substring(fragment.indexOf(';') + 1));

                    Pattern pattern = Pattern.compile("^\\d*,\\d*$");
                    if (pattern.matcher(oneDonat).find()) {
                        BigDecimal value = new BigDecimal(oneDonat.replace(',', '.'));
                        donations[i] = donations[i].add(value);
                    }
                }
            }
        }

        for (int i = 0; i < countries.length; i++) {
            System.out.println((countries[i]) + " - " + donations[i]);
        }
        scanner.close();
    }
}

