import javax.swing.*;

public class Library {
    public static void main(String[] args) {

        Book bk1 = new Book();

        bk1.setTitle("Harry Potter");
        bk1.setPrice(9.99f);
        bk1.setISBN("gruehfjd44");
        bk1.setPages(245);

        JOptionPane.showMessageDialog(null,bk1.toString());




    }
}
