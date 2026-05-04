import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double total = 0;
        boolean more;

        do {
            double price = SafeInput.getRangedDouble(in, "Enter item price", 0.5, 10.0);
            total += price;
            more = SafeInput.getYNConfirm(in, "Do you have more items?");
        } while (more);

        System.out.printf("Total cost: $%.2f\n", total);
    }
}

