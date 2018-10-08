import javax.swing.*;

public class BankDriver {

    public static void main(String args[]) {


        String accnum, balanceAsString;
        double balance;
        String menu = "1. Withdraw Money " +
                "\n2. Lodge Money " +
                "\n3. Exit";

        BankAccount BA1 = new BankAccount();
        Person accHolder = new Person();

        accnum = JOptionPane.showInputDialog("A/C number:");

        balanceAsString = JOptionPane.showInputDialog("Balance:");

        balance = Double.parseDouble(balanceAsString);

        accHolder.setName(JOptionPane.showInputDialog("Account holder:")) ;

        menu = JOptionPane.showInputDialog(menu);

        BA1.setAccnum(accnum);
        BA1.setBalance(balance);
        BA1.setName(accHolder);



        switch(menu) {

            case "1":

                BA1.withdrawMoney(balance);
                break;

            case "2":
                BA1.lodgeMoney(balance);
                break;

            case "3":

                JOptionPane.showMessageDialog(null,"Goodbye");
                break;
        }




        JOptionPane.showMessageDialog(null, BA1.toString());




    }
}