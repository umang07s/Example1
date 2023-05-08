package student;

public class Address {
    int addId;
    Co_Ordinates area;
    String city;
    String state;

    public Address(int addId, String city, String state,Co_Ordinates area) {
        this.addId = addId;
        this.area = area;
        this.city = city;
        this.state = state;
    }

    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    public Co_Ordinates getArea() {
        return area;
    }

    public void setArea(Co_Ordinates area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addId=" + addId +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
