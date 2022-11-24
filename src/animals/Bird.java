package animals;

public abstract class Bird extends Animal {
    protected String livingEnvironment;

    public Bird(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) ? "default" : livingEnvironment;
    }

    public abstract void hunt();


    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isBlank() && !livingEnvironment.isEmpty()) this.livingEnvironment = livingEnvironment;
    }
}
