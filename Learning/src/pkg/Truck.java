package pkg;

public class Truck extends Vehicle {
    private int numWheel;
    private int numSeat;
    private String color;
    private double speed;

    public static void main(String[] args) {
        Truck test = new Truck();
        System.out.println(test.getColor());

    }

    public String getColor() {
        return color;
    }
}


