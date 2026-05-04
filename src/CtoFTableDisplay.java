public class CtoFTableDisplay {

    public static double CtoF(double c) {
        return (c * 9/5) + 32;
    }

    public static void main(String[] args) {
        System.out.printf("%10s %10s\n", "Celsius", "Fahrenheit");
        for(int i = -100; i <= 100; i++) {
            System.out.printf("%10d %10.2f\n", i, CtoF(i));
        }
    }
}
