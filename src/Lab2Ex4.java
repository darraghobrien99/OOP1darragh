import javax.swing.*;

public class Lab2Ex4 {

    public static void main(String args[]) {

        String fullName = getfullName();
        char initial = (char) getInitial(fullName);
        String uppercase = getUppercase();
        String surname = getSurname();
    }

    private static String getSurname() {
    }

    private static String getUppercase(String fullName) {


    }

    private static char getInitial(String fullName) {

        char first = fullName.charAt(0);

        return first;


    }

    private static String getfullName() {

        String fullName;

        fullName = JOptionPane.showInputDialog("Please enter your full name:");

        return fullName;
    }
}
