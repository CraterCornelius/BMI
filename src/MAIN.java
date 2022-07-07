public class MAIN {
    public static void main(String[] args) {
        BMIservice service = new BMIservice();
        double height=1.78;
        int weight=86;
        double index = service.calculate(height , weight);
        System.out.println(index);
    }
}
