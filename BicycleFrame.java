import javax.swing.*;
import java.awt.*;

public class BicycleFrame extends JFrame {

    public static void main(String[] args) {

        BicycleFrame newFrame = new BicycleFrame();
        newFrame.setVisible(true);
        newFrame.getContentPane().setBackground(Color.cyan);


    }

    public BicycleFrame(){

        setTitle("Bicycle Shop");
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
}
