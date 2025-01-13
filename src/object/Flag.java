package object;

import type.Material;

public class Flag extends Decoration {
    private String state1 = "висят";

    public Flag(String name, float height, Material material) {
        super(name, material, height);
    }

    public void chanceStateForRain() {
        state1 = "свисают";
    }

    public String toString() {
        return name + " " + state1;
    }
}
