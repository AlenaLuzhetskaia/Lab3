package object;

import interfacee.Moveable;
import type.Profession;

public class Shortie extends Human implements Moveable {
    protected Profession profession;

    public Shortie(String name, String sex, float mass, String clothers, Place location, Profession profession) {
        super(name, sex, mass, clothers, location);
        this.profession = profession;
    }

    public void say() {
    }


    public void work() {

    }

    public void go() {
    }

    public void changeLocation(Place newLocation) {
        super.changeLocation();
    }
}
