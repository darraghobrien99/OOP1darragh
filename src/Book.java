public class Book {

    private String title;
    private float price;
    private String ISBN;
    private int pages;

    //mutator method

    public void setTitle(String title) {

        this.title = title;

    }

    public void setPrice(float price) {

        this.price = price;
    }

    public void setISBN(String ISBN){

        this.ISBN = ISBN;
    }

    public void setPages(int pages){

        this.pages = pages;
    }

    //Accessor Method

    public String getTitle(){

        return title;
    }

    public float getPrice(){

        return price;
    }

    public String getISBN() {

        return ISBN;
    }

    public int getPages(){

        return pages;
    }

    public String toString() {
        return "Title: " + getTitle()  + "\nPrice: " + getPrice() +"\n" + "ISBN: " +getISBN() + "\n" +
                "Pages: " + getPages();
    }

    //Constructor Method

    public Book(){

        this.title = "No Title";
        this.price = 0.00f;
        this.ISBN = "No ISBN";
        this.pages = 0;
    }

    // Four Argument Constructor Method

    public Book(String title, float price, String ISBN, int pages){

        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setPages(pages);
    }




}
