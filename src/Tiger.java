//205p2 on 9/7/17.
public class Tiger {
    // put your instance variables here!
    String favoriteFood="meat";
    String name;

    public Tiger(String name) {
        // put your constructor content here
        this.name=name;
    }

    public void sleep() {
        // complete your sleep function here, noting the change from global to instance variables
        System.out.println(this.name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        // complete your eat function here!
        System.out.println(this.name + " eats " + food);
        if(food==this.favoriteFood){
            System.out.println("YUM!!! " +this.name+" wants more " +food);
        } else {
            System.out.println(this.name + " sleeps for 8 hours");
        }
    }

    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        tigger.sleep();

    }

}
