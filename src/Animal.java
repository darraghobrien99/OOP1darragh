import javax.swing.*;

public class Animal {

    private String type;
    private String[] continents = new String[5];
    private int age;
    private float weight;

    //mutator methods

    public void setType(String type){

        this.type = type;
    }

    public void setContinents(String[] continents)
    {

        this.continents = continents;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setWeight(float weight) {

        this.weight = weight;
    }

    //Accessor Methods

    public String getType(){

        return type;
    }

    public String[] getContinents(){

        return continents;
    }

    public int getAge(){

        return age;
    }

    public float getWeight() {
        return weight;
    }

    //Constructor Methods

    public Animal(){

        this.type = "No type specified";
        this.continents = null;
        this.age = 0;
        this.weight = 0.0f;

    }

    // 3 argument constructor

    public Animal(String type, String[] continents, int age, float weight){

        setType(type);
        setContinents(continents);
        setAge(age);
        setWeight(weight);
    }
    //toString

    public String toString() {

        for(int i=0;i<continents.length;i++){




        }
        return "Animal Type: " + getType() + "\nContinents: " + getContinents() + "\nAge: " + getAge() + "\nWeight: " + getWeight();
    }
}
