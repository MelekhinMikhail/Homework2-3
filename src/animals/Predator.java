package animals;

import java.util.Objects;

public class Predator extends Mammal {
    private String typeOfFood;

    public Predator(String name, int age, String livingEnvironment, int movementSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);
        this.typeOfFood = (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) ? "default" : typeOfFood;
    }

    public void hunt() {
        System.out.println("Выхожу на охоту");
    }

    @Override
    public void eat() {
        System.out.println("Ем добычу");
    }

    @Override
    public void sleep() {
        System.out.println("Прилягу поспать");
    }

    @Override
    public void move() {
        System.out.println("Передвигаюсь на указанное место");
    }

    @Override
    public void walk() {
        System.out.println("Вышел прогуляться");
    }


    public String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public String toString() {
        return "Хищник "+this.getName()+", которому "+getAge()+" лет, проживает в регионе "+getLivingEnvironment()+", " +
                "скорость передвижения: "+getMovementSpeed()+" км/ч, тип пищи: "+getTypeOfFood();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predator predator = (Predator) o;
        return Objects.equals(typeOfFood, predator.typeOfFood) && Objects.equals(name, predator.name) && Objects.equals(livingEnvironment, predator.livingEnvironment) && Objects.equals(movementSpeed, predator.movementSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfFood);
    }
}
