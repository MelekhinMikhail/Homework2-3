package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, String fuel) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.fuel = (fuel == null || fuel.isBlank() || fuel.isEmpty() || (!fuel.equalsIgnoreCase("Бензин") && !fuel.equalsIgnoreCase("Дизель"))) ? "Дизель" : fuel;
    }

    @Override
    public void refill(String fuel) {
        if (this.fuel.equalsIgnoreCase(fuel)) System.out.println("Заправляем автобус на заправке топливом: "+this.getFuel());
        else System.out.println(fuel+" не подходит для заправки данного автобуса");
    }
}
