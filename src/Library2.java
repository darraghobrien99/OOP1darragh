import javax.swing.*;
import java.util.Scanner;

public class Library2 {
    public static void main(String[] args) {

        Book bk2 = new Book();

        String title, ISBN;
        float price;
        int pages;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Title:");
        title = input.nextLine();

        System.out.println("Enter Price:");
        price = input.nextFloat();

        System.out.println("Enter ISBN:");
        ISBN = input.nextLine();
        ISBN = input.nextLine();

        System.out.println("Enter the number of pages:");
        pages = input.nextInt();

        bk2.setTitle(title);
        bk2.setPrice(price);
        bk2.setISBN(ISBN);
        bk2.setPages(pages);

        if(bk2.getISBN().length() == 13 || bk2.getISBN().length() == 10)
        {


            JOptionPane.showMessageDialog(null, bk2.toString());
        }

        else {


            System.out.println("Error with ISBN");


        }

    }
}
