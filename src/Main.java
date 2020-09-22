public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.83; // рост в см
        double Height = height * height; // квадрат роста, нужен для формулы bmi=weight/height^2
        double weight = 67.6; // вес в кг
        double bmi = service.calculate(Height, weight);
        System.out.println(bmi);
    }
}