import java.util.Scanner;

public class MyPoint {

    private int xval, yval;



    //mutator methods

    public void setXval(int xval) {

        this.xval = xval;
    }

    public void setYval(int yval) {

        this.yval = yval;
    }


    //accessor methods

    public int getXval() {

        return xval;
    }

    public int getYval() {

        return yval;
    }


    //Constructor methods

    public MyPoint(){

        this.yval = 0;
        this.xval = 0;
    }

    // 2 argument methods

    public MyPoint(int xval, int yval) {

        setXval(xval);
        setYval(yval);
    }

    //moveHorizontally

    public int  moveHorizontally() {

        int moveX;

        Scanner input = new Scanner(System.in);

       System.out.println("How much do you want to horizontally:");
        moveX = input.nextInt();

        return moveX + xval;


    }


    public int  moveVertically() {

        int moveY;

        Scanner input = new Scanner(System.in);

        System.out.println("How much do you want to horizontally:");
        moveY = input.nextInt();

        return moveY + yval;

    }

    public String translate(){

       int translateX = xval * -1, translateY = yval * -1;



       return  " ( " + translateX + "," + translateY + " )";

    }

    public double distanceFromOrigin() {

        double formula;

        formula =   Math.sqrt( (0 - 0) + ((xval - yval) * (xval - yval)) );

        return formula;



    }


    public String toString() {

        return "Co-ordinates : ( " + getXval() + " , " + getYval() + " )" + "\n Moved co-ordinates : ( " + moveHorizontally() + " , " + moveVertically() + " )"
                + "\nTranslated co-ordinates: " + translate() + "\nDistance from origin is " + distanceFromOrigin() + "km";
    }





}
