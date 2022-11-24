package animals;

import java.util.Objects;

public class Flying extends Bird {
    private String typeOfMovement;

    public Flying(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        this.typeOfMovement = (typeOfMovement == null || typeOfMovement.isEmpty() || typeOfMovement.isBlank()) ? "default" : typeOfMovement;
    }

    public void fly() {
        System.out.println("Взлетаю");
    }

    @Override
    public void eat() {
        System.out.println("Лечу есть");
    }

    @Override
    public void sleep() {
        System.out.println("Лечу спать");
    }

    @Override
    public void move() {
        System.out.println("Вылетаю на указанное место");
    }

    @Override
    public void hunt() {
        System.out.println("Вылетаю на охоту");
    }


    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public String toString() {
        return "Летающая птица "+this.getName()+", которой "+getAge()+" лет, проживает в регионе "+getLivingEnvironment()+", тип передвижения: "+getTypeOfMovement();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flying flying = (Flying) o;
        return Objects.equals(typeOfMovement, flying.typeOfMovement) && Objects.equals(name, flying.name) && Objects.equals(age, flying.age) && Objects.equals(livingEnvironment, flying.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfMovement);
    }
}
