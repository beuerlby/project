import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int val = 0;
        String trash;
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                val = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("You must enter a valid integer.");
            }
        } while (!done);

        return val;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double val = 0;
        String trash;
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                val = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("You must enter a valid number.");
            }
        } while (!done);

        return val;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int val = 0;
        boolean done = false;

        do {
            val = getInt(pipe, prompt + " [" + low + "-" + high + "]");
            if (val >= low && val <= high) {
                done = true;
            } else {
                System.out.println("Value must be between " + low + " and " + high);
            }
        } while (!done);

        return val;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double val = 0;
        boolean done = false;

        do {
            val = getDouble(pipe, prompt + " [" + low + "-" + high + "]");
            if (val >= low && val <= high) {
                done = true;
            } else {
                System.out.println("Value must be between " + low + " and " + high);
            }
        } while (!done);

        return val;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String val;
        boolean done = false;

        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            val = pipe.nextLine();

            if (val.equalsIgnoreCase("Y")) {
                return true;
            } else if (val.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println("Please enter Y or N.");
            }
        } while (!done);

        return false;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String val;
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            val = pipe.nextLine();
            if (val.matches(regEx)) {
                done = true;
            } else {
                System.out.println("Invalid input.");
            }
        } while (!done);

        return val;
    }

    public static void prettyHeader(String msg) {
        int totalWidth = 60;
        int msgLength = msg.length();
        int spaces = (totalWidth - 6 - msgLength) / 2;

        for (int i = 0; i < totalWidth; i++) System.out.print("*");
        System.out.println();

        System.out.print("***");
        for (int i = 0; i < spaces; i++) System.out.print(" ");
        System.out.print(msg);
        for (int i = 0; i < spaces; i++) System.out.print(" ");
        if ((msgLength % 2) != 0) System.out.print(" ");
        System.out.println("***");

        for (int i = 0; i < totalWidth; i++) System.out.print("*");
        System.out.println();
    }
}

