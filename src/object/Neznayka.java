package object;

import exception.ObjectException;
import type.Profession;

public class Neznayka extends Shortie {
    private boolean hidden;

    public Neznayka(String name, String sex, float mass, String clothers, Place location, Profession profession) {
        super(name, sex, mass, clothers, location, profession);
        this.hidden = true;
    }

    public void hide() throws ObjectException {
        if (hidden) {
            throw new ObjectException("Незнайка");
        } else {
            hidden = true;
            System.out.println(" спрятался");
        }
    }

    public String getOut() {
        if (hidden) {
            System.out.print(" вылезал");
            hidden = false;
        }
        return "";
    }

    public void say(String voice) {
        System.out.println(" сказал: " + voice);
    }
}
