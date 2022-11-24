package animals;

import java.util.Objects;

public class Herbivores extends Mammal{
    private String typeOfFood;

    public Herbivores(String name, int age, String livingEnvironment, int movementSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);
        this.typeOfFood = (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) ? "default" : typeOfFood;
    }

    public void pasture() {
        System.out.println("Я пасусь на лугу");
    }

    @Override
    public void eat() {
        System.out.println("Я ем траву");
    }

    @Override
    public void sleep() {
        System.out.println("Я ложусь спать");
    }

    @Override
    public void move() {
        System.out.println("Перемещаюсь в указанное место");
    }

    @Override
    public void walk() {
        System.out.println("Пойду-ка я прогуляюсь");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public String toString() {
        return "Травоядное животное "+this.getName()+", которому "+getAge()+" лет, проживает в регионе "+getLivingEnvironment()+", " +
                "скорость передвижения: "+getMovementSpeed()+" км/ч, тип пищи: "+getTypeOfFood();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood) && Objects.equals(name, that.name) && Objects.equals(livingEnvironment, that.livingEnvironment) && Objects.equals(movementSpeed, that.movementSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfFood);
    }
}
