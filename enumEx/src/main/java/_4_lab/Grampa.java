package _4_lab;

public class Grampa {

private String name;


    public Grampa(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Behaviours


    @Override
    public String toString() {
        return "Hello my name is " + name;
    }
}

