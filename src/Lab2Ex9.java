import javax.swing.*;

public class Lab2Ex9 {
    public static void main(String args[]){

        double cattle[10] = {144, 223, 445, 654, 342, 546, 756, 346, 563, 259};
        double lessthan250=0, greaterthan400=0, lightest = cattle[0],average, total;

        for(int i =0; cattle.length;i++)
        {

            if(cattle[i] < 250)
            {
                lessthan250++;
            }

            if(cattle[i] > 400)
            {

                greaterthan400++;
            }

            if(cattle[i] < lightest)
                lightest
                        = cattle[i];


        }


        JOptionPane.showMessageDialog(null,"Weights: " + cattle[] +
    "\nNumber under 250kg: " + lessthan250 + "\nPercentage over 400kg: " + greaterthan400/10 * 100 +
    "\nLightest animal: " + lightest);







    }
}
