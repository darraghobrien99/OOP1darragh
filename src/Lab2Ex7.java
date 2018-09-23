import javax.swing.*;

public class Lab2Ex7 {

    public static void main(String args[]){

        int numbers = getNumbers();
        boolean outcome = isEven();

        JOptionPane.showMessageDialog(null,  numbers + " is " +
                outcome);



    }

    private static boolean isEven(int numbers) {

        boolean outcome;

        if((numbers % 2) == 0)
        {
            outcome = true;

        }

        else
            outcome = false;


    }

    private static int getNumbers() {
        int numbers = 0;
        String numbersAsString;
        String list = null;

        while(numbers != -1)
        {

            numbersAsString = JOptionPane.showInputDialog("Please input an integer number:");

            numbers = Integer.parseInt(numbersAsString);

            return numbers;
        }
    }
}
