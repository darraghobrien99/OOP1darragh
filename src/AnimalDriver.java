import javax.swing.*;
import java.util.Scanner;

public class AnimalDriver {
    public static void main(String[] args) {

        String type;
        String[] continents = new String[1];
        int age;
        float weight;

        Animal animal1 = new Animal();

        Scanner input = new Scanner(System.in);

        System.out.println("Animal type:");
        type = input.nextLine();


        System.out.println("Age:");
        age = input.nextInt();

        System.out.println("Weight:");
        weight = input.nextFloat();

        animal1.setType(type);
        animal1.setContinents(continents);
        animal1.setAge(age);
        animal1.setWeight(weight);

        JOptionPane.showMessageDialog(null, animal1.toString());
    }
}
