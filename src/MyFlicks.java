import javax.swing.*;
import java.util.Arrays;

public class MyFlicks {
    public static void main(String args[]) {

        String title, director, numberAsString, durationAsString;
        int duration, number;

        numberAsString = JOptionPane.showInputDialog("How many films would you like to store:");

        number = Integer.parseInt(numberAsString);


        Film[] catalog = new Film[number];

        for (int i = 0; i < catalog.length; i++) {

            Film newfilm = new Film();

             newfilm.setTitle(JOptionPane.showInputDialog("Enter title:"));

            newfilm.setDirector(JOptionPane.showInputDialog("Enter Director:"));

            newfilm.setDuration(Integer.parseInt(JOptionPane.showInputDialog("Enter duration:")));


            //Film newfilm = new Film(title,director,duration);

            //newfilm.setTitle(title);
            //newfilm.setDirector(director);
            //newfilm.setDuration(duration);


            catalog[i] = newfilm;



        }

        Film.displayFilms(catalog);

    }

}
