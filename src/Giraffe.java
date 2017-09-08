/**
 * Created by h205p2 on 9/8/17.
 */
public class Giraffe extends Animal {
    public Giraffe(String name) {
        super(name, "leaves");
    }
    public void eat(String food) {
        if(food==this.favoriteFood){
            System.out.println("YUM!!! " +this.name+" wants more " +food);
            sleep();
        } else {
            System.out.println("YUCK!!! " +this.name+" will not eat " +food);
        }
    }
}
