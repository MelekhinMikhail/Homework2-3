package transport;

import java.time.LocalDate;

public class Car extends Transport{

    public class Key {
        private boolean remoteEngineStart;
        private boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public class Insurance {
        private LocalDate validityPeriod;
        private double cost;
        private String number;

        public Insurance(double cost, String number, int year, int month, int day) {
            this.validityPeriod =  LocalDate.of(year, month, day);
            this.cost = (cost <= 0) ? 1 : cost;
            this.number = (isNumberCorrect(number)) ? number : "Информация не указана";
        }

        public void isInsuranceExpired() {
            if (LocalDate.now().isAfter(validityPeriod)) System.out.println("Необходимо обновить страховку!");
        }

        public boolean isNumberCorrect(String number) {
            if (number.length() != 9 || number == null) return false;
            else {
                char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
                char[] result = number.toCharArray();
                int a = 0;
                for (int i=0; i<result.length; i++) {
                    for (int j=0; j<num.length; j++) {
                        if (result[i] == num[j]) a++;
                    }
                }
                return a == 9;
            }
        }

        public LocalDate getValidityPeriod() {
            return validityPeriod;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
    }

    private double engineVolume;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean isWinterTiresOn;


    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this(brand, model, engineVolume, color, productionYear, productionCountry, "", "", "", 5, false, 80, "");
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean isWinterTiresOn, int maxSpeed, String fuel) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.engineVolume = (engineVolume <= 0) ? 1.5 : engineVolume;
        this.transmission = (transmission.isEmpty() || transmission.isBlank() || transmission == null) ? "default" : transmission;
        this.bodyType = (bodyType.isEmpty() || bodyType.isBlank() || bodyType == null) ? "default" : bodyType;
        this.registrationNumber = (!isRegNumCorrect(registrationNumber)) ? "default" : registrationNumber;
        this.numberOfSeats = (numberOfSeats <= 0) ? 5 : numberOfSeats;
        this.isWinterTiresOn = isWinterTiresOn;
        this.fuel = (fuel == null || fuel.isBlank() || fuel.isEmpty() || (!fuel.equalsIgnoreCase("Бензин") && !fuel.equalsIgnoreCase("Дизель") && !fuel.equalsIgnoreCase("Электричество"))) ? "Дизель" : fuel;
    }

    public void info() {
        System.out.println("Марка: "+this.getBrand()+"; "+
                "Модель: "+this.getModel()+"; "+
                "Объем двигателя: "+this.getEngineVolume()+" л; "+
                "Цвет: "+this.getColor()+"; "+
                "Год выпуска: "+this.getProductionYear()+"; "+
                "Страна производства: "+this.getProductionCountry()+"; "+
                "Коробка передач: "+this.getTransmission()+"; "+
                "Тип кузова: "+this.getBodyType()+"; "+
                "Регистрационный номер: "+this.getRegistrationNumber()+"; "+
                "Количесство мест: "+this.getNumberOfSeats()+"; "+
                "Надеты шины: "+((isWinterTiresOn) ? "зимние" : "летние")+"; " +
                "Тип топлива: "+this.getFuel());;
    }

    @Override
    public void refill(String fuel) {
        if (this.fuel.equalsIgnoreCase(fuel)) {
            if (this.fuel.equalsIgnoreCase("Электричество")) System.out.println("Заряжаем машину на электростанции...");
            else System.out.println("Заправляем машину на заправке топливом: "+this.getFuel());
        } else System.out.println(fuel+" не подходит для заправки данной машины");
    }

    public static boolean isRegNumCorrect(String number) {
        if (number.length() != 9 || number == null) return false;
        else {
            char[] abc = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};
            char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
            char[] result = number.toUpperCase().toCharArray();
            int a = 0;
            for (int i=0; i<result.length; i++) {
                if (i == 0 || i == 4 || i == 5) {
                    for (int j=0; j<abc.length; j++) {
                        if (result[i] == abc[j]) a++;
                    }
                } else {
                    for (int k=0; k<num.length; k++) {
                        if (result[i] == num[k]) a++;
                    }
                }
            }
            return a == 9;

        }
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isWinterTiresOn() {
        return isWinterTiresOn;
    }


    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) this.engineVolume = engineVolume;
    }

    public void setTransmission(String transmission) {
        if (transmission != null && !transmission.isBlank() && !transmission.isEmpty()) this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (isRegNumCorrect(registrationNumber)) this.registrationNumber = registrationNumber;
    }

    public void changeTires() {
        this.isWinterTiresOn = !this.isWinterTiresOn;
    }
}
