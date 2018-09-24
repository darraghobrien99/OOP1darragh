import javax.swing.*;
import java.util.Scanner;

public class Email {
    public static void main(String[] args){

        Message msg1 = new Message();

        String recipient, sender, message;

        Scanner input = new Scanner(System.in);

        System.out.println("Recepient:");
        recipient = input.nextLine();

        System.out.println("Sender:");
        sender = input.nextLine();

        System.out.println("Message:");
        message = input.nextLine();

        msg1.setRecipient(recipient);
        msg1.setSender(sender);
        msg1.setMessage(message);

        JOptionPane.showMessageDialog(null,msg1.toString());


    }
}
