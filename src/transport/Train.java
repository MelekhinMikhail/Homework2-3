package transport;

public class Train extends Transport {
    private double priceOfTheTrip;
    private int timeOfTheTripInMinutes;
    private String departureStation;
    private String endStation;
    private int numberOfWagons;


    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, double priceOfTheTrip, int timeOfTheTripInMinutes, String departureStation, String endStation, int numberOfWagons) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.priceOfTheTrip = (priceOfTheTrip < 0) ? 0 : priceOfTheTrip;
        this.timeOfTheTripInMinutes = (timeOfTheTripInMinutes <= 0) ? 0 : timeOfTheTripInMinutes;
        this.departureStation = (departureStation == null || departureStation.isBlank() || departureStation.isEmpty()) ? "default" : departureStation;
        this.endStation = (endStation == null || endStation.isEmpty() || endStation.isBlank()) ? "default" : endStation;
        this.numberOfWagons = (numberOfWagons <= 0) ? 1 : numberOfWagons;
        this.fuel = "Дизель";
    }

    public void info() {
        System.out.println("Марка: "+this.getBrand()+"; "+
                "Модель: "+this.getModel()+"; "+
                "Цвет: "+this.getColor()+"; "+
                "Год выпуска: "+this.getProductionYear()+"; "+
                "Страна производства: "+this.getProductionCountry()+"; "+
                "Цена поездки: "+this.getPriceOfTheTrip()+"руб.; "+
                "Время поездки: "+this.getTimeOfTheTripInMinutes()+" минут; "+
                "Станция отбытия: "+this.getDepartureStation()+"; "+
                "Станция прибытия: "+this.getEndStation()+"; "+
                "Количество вагонов: "+this.getNumberOfWagons()+"; " +
                "Тип топлива: "+this.getFuel());
    }

    @Override
    public void refill(String fuel) {
        if (this.fuel.equalsIgnoreCase(fuel)) System.out.println("Заправляем поезд топливом: "+this.getFuel());
        else System.out.println(fuel+" не подходит для заправки данного поезда");
    }


    public double getPriceOfTheTrip() {
        return priceOfTheTrip;
    }

    public void setPriceOfTheTrip(double priceOfTheTrip) {
        if (priceOfTheTrip >= 0) this.priceOfTheTrip = priceOfTheTrip;
    }

    public int getTimeOfTheTripInMinutes() {
        return timeOfTheTripInMinutes;
    }

    public void setTimeOfTheTripInMinutes(int timeOfTheTripInMinutes) {
        if (timeOfTheTripInMinutes > 0) this.timeOfTheTripInMinutes = timeOfTheTripInMinutes;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        if (departureStation != null && !departureStation.isBlank() && !departureStation.isEmpty()) this.departureStation = departureStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        if (endStation != null && !endStation.isBlank() && !endStation.isEmpty())this.endStation = endStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons > 0) this.numberOfWagons = numberOfWagons;
    }
}
