public class Main {
    public static void main(String[] args) {

        ElectricCar car1 = new ElectricCar("Sedan", 3000, 1000000, 2017, "Volvo");
        GasCar car2 = new GasCar(95, 7000000, 2017, "BM");
        GasCar car3 = new GasCar("Hatchback", 95, 1250000, 2017, "VolksWagen Golf");
        System.out.println(car1.getFuelType());
        System.out.println(car2.getFuelType());
        System.out.println(car3.getFuelType());
    }
}

