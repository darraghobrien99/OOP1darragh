import javax.swing.*;

public class MyFlicks {

    public static void main(String args[]) {



        String title;
        String director;
        int duration;
        String arraysize;
        int array;

        arraysize = JOptionPane.showInputDialog("How many films would you like to store:");

        array = Integer.parseInt(arraysize);

        Film[] catalog = new Film[array];

        for(int i=0; i<catalog.length;i++)
        {

            Film f = new Film();

            f.setTitle(JOptionPane.showInputDialog("Enter title:"));
            f.setDirector(JOptionPane.showInputDialog("Enter director:"));
            f.setDuration(duration.toString(JOptionPane.showInputDialog("Enter duration:")));
            catalog[i] = f;


        }

        for (int i=0; i<catalog.length;i++)
        {

            JOptionPane.showMessageDialog(catalog[i].toString());
        }




    }
}
