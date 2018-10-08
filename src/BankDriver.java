import javax.swing.*;

public class BankDriver {

    public static void main(String args[]) {


        String accnum, balanceAsString;
        double balance;
        String menu = "1. Withdraw Money " +
                "\n2. Lodge Money " +
                "\n3. Exit";
        String numberAsString;
        int number;

        numberAsString = JOptionPane.showInputDialog("How many bank accounts would you like to create:");

        number = Integer.parseInt(numberAsString);

        BankAccount[] accounts = new BankAccount[number];
        Person accHolder = new Person();


        for (int i = 0; i < accounts.length; i++) {

            BankAccount account = new BankAccount();

            account.setAccnum(JOptionPane.showInputDialog("A/C number:"));

            account.setBalance(Integer.parseInt(JOptionPane.showInputDialog("Balance:")));

            accHolder.setName(JOptionPane.showInputDialog("Account Holder:"));

            accounts[i] = account;


            //menu = JOptionPane.showInputDialog(menu);

        }

        for (int i = 0; i < accounts.length; i++) {

            JOptionPane.showMessageDialog(null, accounts[i].toString());
        }


        //  BA1.setAccnum(accnum);
        // BA1.setBalance(balance);



      /*  switch(menu) {

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

*/


        // JOptionPane.showMessageDialog(null, BA1.toString());


    }
}
