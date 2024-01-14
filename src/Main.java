
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 80;
        double heightMeters = 1.64;
        int index = service.calculate(80, 1.64);

        System.out.println("Ваш индекс массы тела составляет: " + index);
    }
}