import transport.Bus;
import transport.Train;
import transport.Car;
import animals.*;

public class Main {
    public static void main(String[] args) {
        Train first = new Train("Ласточка", "В-901", 2011, "Россия", "", 301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train second = new Train("Ленинград", "D-125", 2019, "Россия", "", 270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);

        first.info();
        second.info();
        System.out.println();

        Bus one = new Bus("Mercedes", "S-105", 2010, "Германия", "Черный", 110, "");
        Bus two = new Bus("Lada", "LRS-1090", 2022, "Россия", "Белый", 90, "");
        Bus three = new Bus("MAN", "NR-308", 2019, "Франция", "Синий", 115, "");

        one.info();
        two.info();
        three.info();
        System.out.println();

        first.refill("Дизель");
        one.refill("Дизель");
        System.out.println();


        Herbivores gazelle = new Herbivores("Газель", 5, "", 30, "трава");
        Herbivores giraffe = new Herbivores("Жираф", 8, "", 18, "листья");
        Herbivores horse = new Herbivores("Лошадь", 10, "Африка", 40, "трава");

        Predator hyena = new Predator("Гиена", 4, "", 25, "мясо");
        Predator tiger = new Predator("Тигр", 7, "Южная Америка", 36, "мясо");
        Predator bear = new Predator("Медведь", 8, "Россия", 25, "мясо");

        Amphibian frog = new Amphibian("Лягушка", 2, "Германия");
        Amphibian snake = new Amphibian("Уж пресноводный", 1, "Беларусь");

        Flightless peafowl = new Flightless("Павлин", 3, "", "ходьба");
        Flightless penguin = new Flightless("Пингвин", 6, "", "ходьба");
        Flightless dodo = new Flightless("Птица додо", 3, "", "ходьба");

        Flying seagull = new Flying("Чайка", 2, "Испания", "по воздуху");
        Flying albatross = new Flying("Альбатрос", 4, "", "по воздуху");
        Flying hawk = new Flying("Сокол", 3, "Северная Америка", "по воздуху");

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(snake);
        System.out.println(peafowl);
        System.out.println(penguin);
        System.out.println(dodo);
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(hawk);

    }
}