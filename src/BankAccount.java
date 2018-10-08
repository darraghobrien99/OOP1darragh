import javax.swing.*;

public class BankAccount {

    private String accnum;
    private double balance;
    private Person name;

    //mutator

    /**
     *
      * @param accnum
     */

    public void setAccnum(String accnum) {

        this.accnum = accnum;
    }


    public void setBalance(double balance) {

        this.balance = balance;

    }

    public void setName(Person name){

        this.name = name;
    }

    //Accessor

    /**
     *
     * @return the account number
     */

    public String getAccnum() {

        return accnum;
    }

    public double getBalance() {

        return balance;
    }

    public Person getName() {

        return name;
    }

    //Constructor

    public BankAccount(){

        this.accnum = "0";
        this.balance = 0.00;
        this.name = null;
    }

    public BankAccount(String accnum, double balance, Person name) {

        setAccnum(accnum);
        setBalance(balance);
        setName(name);
    }

    public String toString() {

        return "\nAccount Number: " + getAccnum() +
                "\nBalance: £" + getBalance() +
                "\nAccount Holder: " + getName();
    }

    public double lodgeMoney(double balance) {

        String lodgementAsString;
        double lodgement;



        lodgementAsString = JOptionPane.showInputDialog("How much would you like to lodge:");

        lodgement = Double.parseDouble(lodgementAsString);

        setBalance(getBalance() + lodgement);

        return getBalance();
    }

    public double withdrawMoney(double balance) {

        String withdrawAsString;
        double withdraw;

        withdrawAsString = JOptionPane.showInputDialog("How much would you like to withdraw:");

        withdraw = Double.parseDouble(withdrawAsString);

         setBalance(getBalance()-withdraw);

         return getBalance();
    }



}