import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Lab2Ex4 {

    public static void main(String args[]) {

        String fullName = getfullName();
        char initial = (char) getInitial(fullName);
        String uppercase = getUppercase(fullName);
        //String surname = getSurname();
        int length = getLength(fullName);


        JOptionPane.showMessageDialog(null, "The number of characters in the name is " +
                length + "\nThe initial of the first name is " + initial + "\n The name in capital letters is " +
                uppercase, "Name",JOptionPane.INFORMATION_MESSAGE);
    }

    private static int getLength(String fullName) {

        int length = fullName.length();

        return length;

    }

    //private static String getSurname() {
    //}

    private static String getUppercase(String fullName) {

        String s = fullName.toUpperCase();
        return s;



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