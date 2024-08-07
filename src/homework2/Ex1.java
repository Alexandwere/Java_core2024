package homework2;

public class Ex1 {
    public static void main(String[] args) {
        String[] words = {"Это", "шашлык", "на", "шампуре"};
        StringBuilder line = new StringBuilder();

        for (String word : words) {
            line.append(word).append("-");
        }
        System.out.println(line.substring(0, line.length()-1));
    }
}