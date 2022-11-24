package animals;

import java.util.Objects;

public class Amphibian extends Animal {
    private String livingEnvironment;

    public Amphibian(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) ? "default" : livingEnvironment;
    }


    public void hunt(){
        System.out.println("Вышел на охоту");
    }

    @Override
    public void eat() {
        System.out.println("Полакомлюсь добычей");
    }

    @Override
    public void sleep() {
        System.out.println("Ложусь спать");
    }

    @Override
    public void move() {
        System.out.println("Перемещаюсь в указанное место");
    }


    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isBlank() && !livingEnvironment.isEmpty()) this.livingEnvironment = livingEnvironment;
    }

    @Override
    public String toString() {
        return "Амфибия "+this.getName()+", которой "+getAge()+" лет, проживает в регионе "+getLivingEnvironment();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(livingEnvironment, amphibian.livingEnvironment) && Objects.equals(name, amphibian.name) && Objects.equals(age, amphibian.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment);
    }
}
