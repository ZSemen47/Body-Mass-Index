public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.83; // рост в м
        double weight = 67.6; // вес в кг
        double bmi = service.calculate(height, weight);
        System.out.printf("Индекс массы тела %.2f", bmi);
    }
}