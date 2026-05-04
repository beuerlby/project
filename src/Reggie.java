import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        String mnum = SafeInput.getRegExString(in, "Enter M number", "^(M|m)\\d{5}$");
        String menu = SafeInput.getRegExString(in, "Enter menu choice", "^[OoSsVvQq]$");

        System.out.println("SSN: " + ssn);
        System.out.println("M#: " + mnum);
        System.out.println("Choice: " + menu);
    }
}

