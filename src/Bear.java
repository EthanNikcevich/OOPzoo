/**
 * Created by h205p2 on 9/8/17.
 */
//public class Bear {
//    String favoriteFood="fish";
//    String name;
//
//    public Bear(String name) {
//        this.name=name;
//    }
//
//    public void sleep() {
//        System.out.println(this.name + " hibernates for 4 months");
//    }
//
//    public void eat(String food) {
//        System.out.println(this.name + " eats " + food);
//        if(food==this.favoriteFood){
//            System.out.println("YUM!!! " +this.name+" wants more " +food);
//        } else {
//            sleep();
//        }
//    }
//}
public class Bear extends Animal {
    public Bear(String name) {
        super(name, "fish");
    }
    public void sleep() {
        System.out.println(this.name + " hibernates for 4 months");
    }
}
