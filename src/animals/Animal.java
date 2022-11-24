package animals;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = (name == null || name.isBlank() || name.isEmpty()) ? "default" : name;
        this.age = (age < 0) ? 0 : age;
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) this.age = age;
    }
}
