import javax.swing.*;
import java.awt.*;

public class Lab2Exercise2 {

    public static void main(String args[]){

        String info = getTable();

        display(info);
    }

    private static void display(String info) {
        JTextArea area = new JTextArea(info);
        area.setFont(new Font("monospaced", Font.PLAIN, 12));

        JOptionPane.showMessageDialog(null,area, "table", JOptionPane.INFORMATION_MESSAGE);
    }

    private static String getTable(){
        int yards = 0, inches = 0;
        String table = String.format("%-10s%-10s%-10s%-10s", "Yards", "inches", "\n----------", "----------\n");

        for(int i=0;i<=10;i++)
        {
            yards = i;
            inches = yards * 36;

            table += (String.format("%-10d%-10d", yards, inches) + "\n");
        }

        return table;
    }
}
