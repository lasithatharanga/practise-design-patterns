public class Dog extends Animal {

    public Dog(){
        super();

        setSound("Baw bawww baw");
        setFlyingAbility(new CantFly());
    }
    public void digHole() {
        System.out.println("Dug a Hole");
    }

}