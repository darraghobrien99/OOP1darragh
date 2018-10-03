import java.util.Scanner;

public class BicycleDriver {
    public static void main(String args[]) {

        String name, make;
        int value;

        Bicycle bike = new Bicycle("John", 700, "Toyota" );

        Scanner input = new Scanner(System.in);

        System.out.println("Enter owners name:");
        name = input.nextLine();

        System.out.println("Enter value:");
        value = input.nextInt();

        System.out.println("Enter make:");
        make = input.nextLine();
        make = input.nextLine();

        bike.setName(name);
        bike.setValue(value);
        bike.setMake(make);

        System.out.println(bike.toString());


    }
}
