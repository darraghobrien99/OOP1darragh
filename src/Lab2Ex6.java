import javax.swing.*;
import java.awt.*;

public class Lab2Ex6 {

    public static void main(String args[]){

        String info = cube();

        display(info);
    }

    private static void display(String info) {
        JTextArea area = new JTextArea(info);
        area.setFont(new Font("monospaced", Font.PLAIN, 12));

        JOptionPane.showMessageDialog(null,area, "table", JOptionPane.INFORMATION_MESSAGE);
    }

    private static String cube(){
        int number = 0, cube =0;
        String table = String.format("%-10s%-10s%-10s%-10s", "Number", "Cube", "\n----------", "----------\n");

        for(int i=0;i<=15;i++)
        {
            number = i;
            cube = number * number * number;

            table += (String.format("%-10d%-10d", number, cube) + "\n");
        }

        return table;
    }
}