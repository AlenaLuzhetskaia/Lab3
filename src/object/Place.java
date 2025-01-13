package object;

public abstract class Place {
    private String name;
    private int population;
    private String characteristic;
    private double area;

    public Place(String name, int population, String characteristic, double area) {
        this.name = name;
        this.population = population;
        this.characteristic = characteristic;
        this.area = area;
    }

    public void location() {
    }
}
