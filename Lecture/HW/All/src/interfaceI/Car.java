/**
 * @ชื่อ นายศรชัย สมสกุล
 * @รหัสนิสิต 6510405814
 */

package interfaceI;

public class Car implements Min, Comparable {
    private String license;
    private double kiloDriven;

    public Car(String license, double kiloDriven) {
        this.license = license;
        this.kiloDriven = kiloDriven;
    }

    public String getLicense() {
        return license;
    }

    public double getKiloDriven() {
        return kiloDriven;
    }

    @Override
    public double getMin() {
        return getKiloDriven();
    }

    @Override
    public int compareTo(Object other) {
        Car otherCar = (Car) other;
        return (int) (this.kiloDriven - otherCar.kiloDriven);
    }
}
