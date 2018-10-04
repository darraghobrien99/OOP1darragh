import javax.swing.*;

public class BankDriver {

    public static void main(String args[]) {


        String accnum, balanceAsString;
        double balance;
        String name;

        BankAccount BA1 = new BankAccount();

        accnum = JOptionPane.showInputDialog("A/C number:");

        balanceAsString = JOptionPane.showInputDialog("Balance:");

        balance = Double.parseDouble(balanceAsString);

        name = JOptionPane.showInputDialog("Account holder:");


        JOptionPane.showMessageDialog(null, BA1.toString());




    }
}
