public class Animal {
    private String name;
    private double hieght;
    private int weight;
    private String sound;
    private Flys flyingType;

    public void setName (String name) {
        this.name = name;
    }
    
    public String getName () {
        return this.name;
    }
    /**
     * @return the hieght
     */
    public double getHieght() {
        return hieght;
    }

    /**
     * @param hieght the hieght to set
     */
    public void setHieght(double hieght) {
        this.hieght = hieght;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }
    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        if(weight<0){
            System.out.println("Please enter valid weight");
        } else {
            
            this.weight = weight;
        }
    } 
    /**
     * @return the sound
     */
    public String getSound() {
        return sound;
    }

    /**
     * @param sound the sound to set
     */
    public void setSound(String sound) {
        this.sound = sound;
    }

    public void tryToFly() {
        this.flyingType.fly();
    }

    public void setFlyingAbility(Flys type) {
        this.flyingType = type;
    }
}