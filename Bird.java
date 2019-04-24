public class Bird extends Animal {
    public Bird(){
        super();

        setSound("Kaaaaaark");
        setFlyingAbility(new CanFly());
    }
}