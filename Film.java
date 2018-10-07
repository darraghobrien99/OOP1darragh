public class Film {

    private String title;
    private String director;
    private int duration;
    private int count=0;

    //mutator

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


    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    public int getCount() {
         count++;
        return count;
    }

    //constructor

    public Film() {

        this.title = "unknown";
        this.director = "unknown";
        this.duration = 0;
    }

    public Film(String title,String director, int duration) {


        setTitle(title);
        setDirector(director);
        setDuration(duration);
    }


    public String toString() {

        return "Number of films:" + getCount() +
        "Film: " + getTitle()  +
        "Director: " + getDirector()  +
        "Duration: " + getDuration();
    }
}
