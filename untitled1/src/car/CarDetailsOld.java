package car;

public class CarDetailsOld {
    CarCompany carCompany;
    String carName;
    String registerDate;
    int ownerDt;
    long carPrice;
    long distance;
    String fuelType;

    public CarDetailsOld(CarCompany carCompany, String carName, String registerDate, int ownerDt, long carPrice, long distance, String fuelType) {
        this.carCompany = carCompany;
        this.carName = carName;
        this.registerDate = registerDate;
        this.ownerDt = ownerDt;
        this.carPrice = carPrice;
        this.distance = distance;
        this.fuelType = fuelType;
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

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public int getOwnerDt() {
        return ownerDt;
    }

    public void setOwnerDt(int ownerDt) {
        this.ownerDt = ownerDt;
    }

    public long getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(long carPrice) {
        this.carPrice = carPrice;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "CarDetailsOld{" +
                "carCompany=" + carCompany +
                ", carName='" + carName + '\'' +
                ", registerDate='" + registerDate + '\'' +
                ", ownerDt=" + ownerDt +
                ", carPrice=" + carPrice +
                ", distance=" + distance +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
