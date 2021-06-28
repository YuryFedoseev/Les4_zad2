public class Main {
    public static void main(String[] args) {
        BmiService  service = new BmiService ();
        double height = 1.6;//рост тела в метрах
        double weight = 77;//вес тела в кг
        double index = service.calculate(weight , height);
        System.out.println(index);

    }
}
