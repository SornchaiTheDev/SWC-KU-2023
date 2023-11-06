package pkg;

public class Condo extends Resident {
    public Condo(int price,double area) {
        this(price,area,1);
        System.out.println("Condo1");
    }

    public Condo(int price,double area,int numMember) {
        System.out.println("Condo2");
    }
}
