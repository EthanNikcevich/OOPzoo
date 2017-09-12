import java.util.ArrayList;

/**
 * Created by h205p2 on 9/8/17.
 */
public class Runner {
    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        Bear pooh = new Bear("Pooh");
        Unicorn rarity = new Unicorn("Rarity");
        Bee stinger = new Bee("Stinger");
        Giraffe gemma = new Giraffe("Gemma");

        ArrayList<Animal> A = new ArrayList<>();
        A.add(tigger);
        A.add(pooh);
        A.add(rarity);

        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals(A,"cookies");
//        tigger.eat("meat");
//        pooh.eat("fish");
//        pooh.eat("meat");
//        rarity.eat("marshmallows");
//        Giraffe gemma = new Giraffe("Gemma");
//        gemma.eat("meat");
//        gemma.eat("leaves");
//        Bee stinger = new Bee("Stinger");
//        stinger.eat("ice cream");
//        stinger.eat("pollen");
    }
}
