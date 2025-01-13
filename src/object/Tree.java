package object;

import type.Material;

public class Tree extends Decoration {
    private String state1 = "нарядные";

    public Tree(String name, float height, Material material) {
        super(name, material, height);
    }

    public void chanceStateForRain() {
        state1 = "грязные";
    }

    public String toString() {
        return name + " " + state1;
    }
}
