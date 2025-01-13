package object;

import type.Position;

public class City extends Place {
    protected Position position;

    public City(String name, int population, String characteristic, double area) {
        super(name, population, characteristic, area);
        this.position = position;
    }
}
