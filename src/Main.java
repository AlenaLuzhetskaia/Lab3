import exception.ObjectException;
import object.*;
import type.Material;
import type.Profession;


import java.util.Random;

// вариант 123347
public class Main {
    private static Object Place;

    public static void main(String[] args) {
        object.Place GreenCity = null;
        
        Neznayka neznayka = new Neznayka(
                "Незнайка",
                "мужчина",
                0.2F,
                "Оранжевый костюм",
                GreenCity,
                Profession.SLACKER);
        
        Ball ball = new Ball(
                "бал");

        Tent tent = new Tent(
                "палатки",
                0.25F,
                Material.FABRIC);

        Rope rope = new Rope("верёвочки", 0.05F, Material.SYNTHETICS);

        Light light = new Light(
                "фонарики",
                0.2F,
                Material.METAL);

        Flag flag = new Flag(
                "флажки",
                0.03F,
                Material.FABRIC);

        Tree tree = new Tree(
                "деревья",
                0.65F,
                Material.WOODEN);

        Random random = new Random();
        int probability = 50;
        boolean eventHappened = random.nextInt(100) < probability;

        if (eventHappened) {
            ball.chanceStateForRain();
            tent.chanceStateForRain();
            rope.chanceStateForRain();
            light.chanceStateForRain();
            flag.chanceStateForRain();
            tree.chanceStateForRain();
        }

        System.out.print(neznayka.getName());
        System.out.print(neznayka.getOut());
        System.out.println(" и всё повторялось снова");
        System.out.print(neznayka.getName());
        neznayka.say("Не буду больше вылезать! Надо быть твёрдым. Буду твёрдо сидеть здесь хоть до завтрашнего дня. " +
                "Вылезу, только когда бал начнётся");
        System.out.print(neznayka.getName());
        try {
            neznayka.hide();
        }
        catch (ObjectException error) {
            System.out.print(error.getMessage());
        }
        System.out.println("На следующий день ");
        System.out.println(ball.toString());
        System.out.print(tent.toString());
        if (eventHappened) {
            System.out.println(" насквозь");
        }
        else {
            System.out.println(" словно пряничные избушки");
        }
        System.out.print(rope.toString());
        if (eventHappened) {
            System.out.println(" из-за ветра");
        }
        else {
            System.out.println(" над площадкой");
        }
        System.out.println(light.toString());
        System.out.println(flag.toString());
        System.out.print(tree.toString());
        if (eventHappened) {
            System.out.println(" и некрасивые");
        }
        else {
            System.out.println(" словно новогодняя ёлка");
        }
        try {
            neznayka.hide();
        }
        catch (ObjectException error) {
            System.out.print(error.getMessage());
        }
    }
}