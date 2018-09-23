import javax.swing.*;

public class Lab2Ex8 {

    public static void main(String args[]){

        int[] anArray;
        String[] arrayAsString = new String[10];

        anArray = new int[10];

        for(int i=0;i<arrayAsString.length;i++)
        {

           arrayAsString[i] = JOptionPane.showInputDialog("Please enter an integer:");

           anArray[i] = Integer.parseInt(arrayAsString[i]);


        }

        JOptionPane.showMessageDialog(null,"The first number is " + anArray[0] +
                "\nThe fifth nubmer is " + anArray[4]);
    }
}
