/**
 * @ชื่อ นายศรชัย สมสกุล
 * @รหัสนิสิต 6510405814
 */

package interfaceII;

public class Car {
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

}
