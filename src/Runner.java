/**
 * Created by h205p2 on 9/8/17.
 */
public class Runner {
    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        Bear pooh = new Bear("Pooh");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("rarity");
        rarity.eat("marshmallows");
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        Bee stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");
    }
}

