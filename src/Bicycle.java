public class Bicycle {

    private String name;
    private int value;
    private String make;

    //mutator methods

    public void setName(String name) {

        this.name = name;
    }

    public void setValue(int value) {

        this.value = value;
    }

    public void setMake(String make) {

        this.make = make;
    }

    //accessor methods

    public String getName(){

        return name;
    }

    public int getValue(){

        return value;
    }

    public String getMake(){

        return make;
    }

    //constructor methods

    public Bicycle() {

        this.name = "unknown";
        this.value = 0;
        this.make = "unknown";


    }

    // 3 argument

    public Bicycle(String name, int value, String make){

        setName(name);
        setValue(value);
        setMake(make);

    }


    public String toString() {

        return "Owner: " + getName() + "\nValue: £" + getValue() + "\nMake: " + getMake();
    }

}
