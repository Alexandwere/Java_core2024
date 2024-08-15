package homework3.ex2;

import homework3.ex2.factories.SamsungFactory;
import homework3.ex2.phones.Samsung;

public class Runner {
    public static void main(String[] args) {
        Samsung phone1 = SamsungFactory.makePhone();
        phone1.photo();
        System.out.println(phone1.toString());
    }
}
