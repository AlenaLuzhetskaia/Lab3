package object;

import interfacee.Creature;
import interfacee.Moveable;

public abstract class Human implements Creature, Moveable {
    private String name;
    private String sex;
    private float mass;
    private String clothers;
    protected Place location;

    public Human(String name, String sex, float mass, String clothers, Place location) {
        this.name = name;
        this.sex = sex;
        this.mass = mass;
        this.clothers = clothers;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public float weight() {
        return mass;
    }

    public void breathe() {
    }

    public void changeLocation(Place newLocation) {
        this.location = newLocation;
    }

    public interface Moveable {
        void changeLocation();
    }
}
