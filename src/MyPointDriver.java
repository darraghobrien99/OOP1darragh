import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class MyPointDriver {
    public static void main (String args[]) {


        int xVal, yVal,moveX, moveY;

        MyPoint newPoint = new MyPoint();

        Scanner input = new Scanner(System.in);

        System.out.println("What is the x-value:");
        xVal = input.nextInt();

        System.out.println("What is the y-value:");
        yVal = input.nextInt();


        newPoint.setYval(yVal);
        newPoint.setXval(xVal);


System.out.println(newPoint.toString());










    }
}
