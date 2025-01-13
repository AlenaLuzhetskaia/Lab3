package object;

import type.Material;

public class Tent extends Decoration {
    private String state1 = "красовались";
    private String state2 = "сверкали";

    public Tent(String name, float height, Material material) {
        super(name, material, height);
    }

    public void chanceStateForRain() {
        state1 = "испачкались";
        state2 = "промокли";
    }

    public String toString() {
        return name + " " + state1 + " и " + state2;
    }
}
