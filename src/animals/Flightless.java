package animals;

import java.util.Objects;

public class Flightless extends Bird {
    private String typeOfMovement;

    public Flightless(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        this.typeOfMovement = (typeOfMovement == null || typeOfMovement.isEmpty() || typeOfMovement.isBlank()) ? "default" : typeOfMovement;
    }

    public void walk() {
        System.out.println("Я гуляю");
    }

    @Override
    public void eat() {
        System.out.println("Пойду поем");
    }

    @Override
    public void sleep() {
        System.out.println("Пойду посплю");
    }

    @Override
    public void move() {
        System.out.println("Передвигаюсь в указанное место");
    }

    @Override
    public void hunt() {
        System.out.println("Выхожу на охоту");
    }


    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public String toString() {
        return "Нелетающая птица "+this.getName()+", которой "+getAge()+" лет, проживает в регионе "+getLivingEnvironment()+", тип передвижения: "+getTypeOfMovement();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(typeOfMovement, that.typeOfMovement) && Objects.equals(name, that.name) && Objects.equals(age, that.age) && Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfMovement);
    }
}
