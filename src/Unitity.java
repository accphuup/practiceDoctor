
import java.util.Scanner;

public class Unitity {

    private static final Scanner sc = new Scanner(System.in);

    public static int checkInputChoice(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                String input = sc.nextLine().trim();
                int number = Integer.parseInt(input);

                if (number >= 1 && number <= 5) {
                    return number;
                } else {
                    System.err.println("Input must be in range 1 - 5");
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid format! Please enter again.");
            }
        }
    }

    public static String checkInputString(String msg) {
        while (true) {
            System.out.println(msg);
            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.err.println("Input must not empty!");
            } else {
                return input;
            }
        }
    }

    public static int checkInputInt(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                String input = sc.nextLine().trim();
                int number = Integer.parseInt(input);

                if (number >= 0) {
                    return number;
                } else {
                    System.err.println("Input must be >= 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid format! Please enter again.");
            }
        }
    }

    public static String checkInputUpdateString(String msg) {
        while (true) {
                System.out.println(msg);
                String input = sc.nextLine().trim();
                return input;
        }
    }

    public static int checkInputUpdateInt(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                String input = sc.nextLine().trim();

                if (input.isEmpty()) {
                    return -1;
                }
                int number = Integer.parseInt(input);
                if (number >= 0) {
                    return number;
                } else {
                    System.err.println("Input must be >= 0");
                }

            } catch (NumberFormatException e) {
                System.err.println("Invalid format! Please enter again.");
            }
        }
    }

}
