package student;

public class Co_Ordinates {
    int a;
    int b;

    public Co_Ordinates(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Co_Ordinates{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
