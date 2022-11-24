package animals;

public abstract class Mammal extends Animal {
    protected String livingEnvironment;
    protected int movementSpeed;

    public Mammal(String name, int age, String livingEnvironment, int movementSpeed) {
        super(name, age);
        this.livingEnvironment = (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) ? "default" : livingEnvironment;
        this.movementSpeed = (movementSpeed <= 0) ? 1 : movementSpeed;
    }

    public abstract void walk();


    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isBlank() && !livingEnvironment.isEmpty()) this.livingEnvironment = livingEnvironment;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        if (movementSpeed > 0) this.movementSpeed = movementSpeed;
    }
}
