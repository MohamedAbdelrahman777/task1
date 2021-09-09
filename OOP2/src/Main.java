public class Main {
    public static void main(String[] args){
        // The Car Task
        ElectricalCar c1=new ElectricalCar("Sedan",3000,1500000,2019,"Tesla");
        GasCar c2=new GasCar(95,1000000,2017,"M4455");
        GasCar c3=new GasCar("Fabrot",95,1200000,2020,"BMW Z4");
        System.out.println(c1.getFuelType());
        System.out.println(c2.getFuelType());
        System.out.println(c3.getFuelType());
        System.out.println("The total number of cars is "+Car.getNumberOfCars());
        System.out.println();// for space between two tasks
        // The Shape Task
        Shape c= (Shape) new Circle(30);
        Shape s= new Square(30);
        displayShape(c);
        displayShape(s);
    }
    public static void displayShape(Shape shape){
        System.out.println("This shape is "+shape.getShapeName()+" and its area is equal to " +shape.getArea());
    }
}