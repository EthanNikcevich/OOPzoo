//205p2 on 9/7/17.
//public class Tiger extends Animal {
//    // put your instance variables here!
//    String favoriteFood="meat";
//    String name;
//
//    public Tiger(String name) {
//        this.name=name;
//    }
//
//    public void sleep() {
//        System.out.println(this.name + " sleeps for 8 hours");
//    }
//
//    public void eat(String food) {
//        // complete your eat function here!
//        System.out.println(this.name + " eats " + food);
//        if(food==this.favoriteFood){
//            System.out.println("YUM!!! " +this.name+" wants more " +food);
//        } else {
//            System.out.println(this.name + " sleeps for 8 hours");
//        }
//    }
//
//    public static void main(String[] args) {
//        Tiger tigger = new Tiger("Tigger");
//        tigger.eat("meat");
//        tigger.eat("kibble");
//        tigger.sleep();
//
//    }
//
//}
public class Tiger extends Animal {
    public Tiger(String name) {
        // don't forget to correct the call to the superclass initializer!
        super(name, "meat");
    }
}
