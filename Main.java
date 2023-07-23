import Tools.ToolBox;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Chevrolete", "Camaro", 2022);
        car.setYear(2023);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}