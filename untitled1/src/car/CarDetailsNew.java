package car;

public class CarDetailsNew {
    int purchaseIdNumber;
    CarCompany carCompany;
    String carName;
    String carModelName;
    long carPrice;
    long engine;
    int seatingCapacity;
    String fuelType;

    public CarDetailsNew(int purchaseIdNumber, CarCompany carCompany, String carName, String carModelName, long carPrice, long engine, int seatingCapacity, String fuelType) {
        this.purchaseIdNumber = purchaseIdNumber;
        this.carCompany = carCompany;
        this.carName = carName;
        this.carModelName = carModelName;
        this.carPrice = carPrice;
        this.engine = engine;
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    public int getPurchaseIdNumber() {
        return purchaseIdNumber;
    }

    public void setPurchaseIdNumber(int purchaseIdNumber) {
        this.purchaseIdNumber = purchaseIdNumber;
    }

    public CarCompany getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(CarCompany carCompany) {
        this.carCompany = carCompany;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarModelName() {
        return carModelName;
    }

    public void setCarModelName(String carModelName) {
        this.carModelName = carModelName;
    }

    public long getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(long carPrice) {
        this.carPrice = carPrice;
    }

    public long getEngine() {
        return engine;
    }

    public void setEngine(long engine) {
        this.engine = engine;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "CarDetailsNew{" +
                "purchaseIdNumber=" + purchaseIdNumber +
                ", carCompany=" + carCompany +
                ", carName='" + carName + '\'' +
                ", carModelName='" + carModelName + '\'' +
                ", carPrice=" + carPrice +
                ", engine=" + engine +
                ", seatingCapacity=" + seatingCapacity +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
