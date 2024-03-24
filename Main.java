import javax.swing.*;

public class Main {
    private static User person;

    public static User getPerson() {
        if (person == null) {
            person = new User("Sergio",33);
        }
        return person;
    }

    public static void main(String[] args) {
        User codPlayer = new User("Mhohamed",54);
        System.out.println(codPlayer);

        User genericUser = getPerson();
        System.out.println(genericUser);
    }
}
