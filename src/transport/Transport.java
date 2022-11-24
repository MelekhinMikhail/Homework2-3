package transport;

public abstract class Transport {
    protected String brand;
    protected String model;
    protected int productionYear;
    protected String productionCountry;
    protected String color;
    protected int maxSpeed;
    protected String fuel;


    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        this.brand = (brand.isEmpty() || brand.isBlank() || brand == null) ? "default" : brand;
        this.model = (model.isEmpty() || model.isBlank() || model == null) ? "default" : model;
        this.color = (color.isEmpty() || color.isBlank() || color == null) ? "белый" : color;
        this.productionYear = (productionYear <= 0) ? 2000 : productionYear;
        this.productionCountry = (productionCountry.isEmpty() || productionCountry.isBlank() || productionCountry == null) ? "default" : productionCountry;
        this.maxSpeed = (maxSpeed <= 0) ? 80 : maxSpeed;
    }

    public void info() {
        System.out.println("Марка: "+this.getBrand()+"; "+
                "Модель: "+this.getModel()+"; "+
                "Цвет: "+this.getColor()+"; "+
                "Год выпуска: "+this.getProductionYear()+"; "+
                "Страна производства: "+this.getProductionCountry()+"; "+
                "Максимальная скорость(км/ч): "+this.getMaxSpeed()+"; " +
                "Тип топлива: "+this.getFuel());

    }

    public abstract void refill(String fuel);

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getFuel() {
        return fuel;
    }

    public void setColor(String color) {
        if (color != null && !color.isBlank() && !color.isEmpty()) this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) this.maxSpeed = maxSpeed;
    }
}
