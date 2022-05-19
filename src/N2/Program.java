package N2;

public class Program {
    public static void main(String[] args) {
        FuelCar bmw = new FuelCar("bmw",10,160);
        FuelCar audi = new FuelCar("bmw",11,160);
        System.out.println(bmw.equals(audi));
        System.out.println(bmw.getClass());
        System.out.println(bmw.hashCode());
        System.out.println(audi.hashCode());
        System.out.println(bmw);
        System.out.println(audi);

    }
}
