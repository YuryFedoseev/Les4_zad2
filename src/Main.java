public class Main {
    public static void main(String[] args) {
        BmiService  service = new BmiService ();
        double rost = 1.6;//рост тела в метрах
        double massa = 77;//вес тела в кг
        double index = service.calculate(massa , rost);
        System.out.println(index);

    }
}
