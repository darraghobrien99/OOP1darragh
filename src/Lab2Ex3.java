import javax.swing.*;
import java.awt.*;

public class Lab2Ex3 {

    public static void main(String args[]){

      String name = getName(); //info = getTable();

        float length = getLength();
        float breadth = getBreadth();
        float cost = getCost();
        float area = (float) getArea(length, breadth);
        float total = area * cost;

        //display(info);

        JOptionPane.showMessageDialog(null, "Quotation for " + name + "\nLength of room: " + length + " m." + "\nBreadth of room: " +
                breadth + " m." + "\nTotal area of the room: " + area + " sq. m." + "\nCost per square metre " + cost + " euro" + "\nTotal Cost of carpet: " + String.format("%.2f", total) + " euro", "Quotation",
                JOptionPane.INFORMATION_MESSAGE);


    }

    /*private static void display(String info) {

        JTextArea area = new JTextArea(info);
        area.setFont(new Font("monospaced", Font.PLAIN, 12));

        JOptionPane.showMessageDialog(null,area, "table", JOptionPane.INFORMATION_MESSAGE);
    }*/


    private static float getArea(float length, float breadth) {

       float area;

        area = length * breadth;

        return area;
    }

    private static float getCost() {

        String costAsString;
        float cost;

        costAsString = JOptionPane.showInputDialog("Please enter the cost per sqaure metre:");

        cost = Float.parseFloat(costAsString);

        return cost;

    }

    private static float getBreadth() {

        String breadthAsString;
        float breadth;

        breadthAsString = JOptionPane.showInputDialog("Please enter the breadth:");

        breadth = Float.parseFloat(breadthAsString);

        return breadth;
    }

    private static float getLength() {
        String lengthAsString;
        float length;

        lengthAsString = JOptionPane.showInputDialog("Please enter the length:");

        length = Float.parseFloat(lengthAsString);

        return length;
    }

    private static String getName() {

        String name;
        name = JOptionPane.showInputDialog("Please enter your name:");

        return name;




    }
}
