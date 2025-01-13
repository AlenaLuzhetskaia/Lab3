package object;

import type.Material;

public abstract class Decoration {
    protected String name;
    private Material material;
    private float height;

    public Decoration(String name, Material material, float height) {
        this.name = name;
        this.material = material;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void decorate() {
    }
}
