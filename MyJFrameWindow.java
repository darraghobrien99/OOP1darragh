import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyJFrameWindow extends JFrame implements WindowListener {

    public static void main(String args[]){
        MyJFrameWindow newFrame = new MyJFrameWindow();
        newFrame.setVisible(true);
        newFrame.getContentPane().setBackground(Color.cyan);


    }

    public MyJFrameWindow(){

        setTitle("My own JFrame Application");
        setSize(300,200);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    public void addWindowListener(WindowListener e){


    }

    public void windowOpened(WindowEvent e) {

        JOptionPane.showMessageDialog(null,"Opened");

    }

    public void windowClosing(WindowEvent e) {

        int choose = JOptionPane.YES_NO_OPTION;
         JOptionPane.showConfirmDialog(this,"Confirm to close?","Confirmation", choose);

        if(choose == 0){
            JOptionPane.showMessageDialog(null,"Yes Option");
        }

        else{
            JOptionPane.showMessageDialog(null,"No Option");
        }

    }

    public void windowClosed(WindowEvent e) {

    }

    public void windowIconified(WindowEvent e) {

    }

    public void windowDeiconified(WindowEvent e) {

    }

    public void windowActivated(WindowEvent e) {

    }

    public void windowDeactivated(WindowEvent e) {

    }
}
