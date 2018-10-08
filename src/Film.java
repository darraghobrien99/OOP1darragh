import javax.swing.*;
import java.awt.*;

public class Film {

    private String title;
    private String director;
    private int duration;
    private int counter=0;


    //mutator methods


    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {

        this.director = director;
    }

    public void setDuration(int duration) {

        this.duration = duration;
    }


    //accessor

    public int getDuration() {
        return duration;
    }

    public String getDirector() {
        return director;
    }

    public String getTitle() {
        return title;
    }

    public int getCounter() {
        return counter;
    }

    //constructor

    public Film() {

        this.title = "unknown";
        this.director = "unknown";
        this.duration = 0;

    }

    public Film(String title, String director, int duration) {

        setTitle(title);
        setDirector(director);
        setDuration(duration);
        this.counter++;
    }

  public String toString() {


        return "\n\nFilm: " + getTitle() + "\nDirector: " + getDirector() + "\nDuration: " + getDuration() + "mins";

    }

   /* public String displayFilms() {

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Serif", Font.ITALIC, 16));


    }*/
}
