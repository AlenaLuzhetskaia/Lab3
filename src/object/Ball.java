package object;

public class Ball {
    private String name;
    private String state1 = "состоялся";


    public Ball(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void chanceStateForRain() {
        state1 = "не состоялся из-за дождя";
    }

    public String toString() {
        return name + " " + state1;
    }
}
