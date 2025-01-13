package object;

import type.Material;

public class Rope extends Decoration {
    private String state1 = "протянуты";

    public Rope(String name, float height, Material material) {
        super(name, material, height);
    }

    public void chanceStateForRain() {
        state1 = "порваны";
        }

    public String toString() {
        return name + " " + state1;
    }

}
