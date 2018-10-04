import javax.swing.*;

public class BankAccount {

    private String accnum;
    private double balance;
    private String name;

    //mutator

    public void setAccnum(String accnum) {

        this.accnum = accnum;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public void setName(String name){

        this.name = name;
    }

    //Accessor

    public String getAccnum() {

        return accnum;
    }

    public double getBalance() {

        return balance;
    }

    public String getName() {

        return name;
    }

    //Constructor

    public BankAccount(){

        this.accnum = "0";
        this.balance = 0.00;
        this.name = "unknown";
    }

    public BankAccount(String accnum, double balance, String name) {

        setAccnum(accnum);
        setBalance(balance);
        setName(name);
    }

    public String toString() {

        return "Account Number: " + getAccnum() +
                "\nBalance: " + getBalance() +
                "\nAccount Holder: " + getName();
    }

    public double lodgeMoney(double balance) {

        String lodgementAsString;
        double lodgement;

        lodgementAsString = JOptionPane.showInputDialog("How much would you like to lodge:");

    lodgement = Double.parseDouble(lodgementAsString);

    return balance + lodgement;
    }

    public double withdrawMoney(double balance) {

        String withdrawAsString;
        double withdraw;

        withdrawAsString = JOptionPane.showInputDialog("How much would you like to withdraw:");

        withdraw = Double.parseDouble(withdrawAsString);

        return balance - withdraw;
    }

}
