package car;

public class CarCompany {
    int id;
    String companyName;

    public CarCompany(int id, String companyName) {
        this.id = id;
        this.companyName = companyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "CarCompany{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
