
import java.util.Scanner;

public class Unitity {

    private static final Scanner sc = new Scanner(System.in);

    public static int checkInputChoice(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                String input = sc.nextLine().trim();
                int number = Integer.parseInt(input);
                if (number >= 1 && number <= 5) {
                    return number;
                } else {
                    System.err.println("Input must be in range 1-5!");
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid format! Enter again.");
            }

        }
    }

    public static String checkInputString(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                String input = sc.nextLine().trim();
                if (input.isEmpty()) {
                    System.err.println("Input must not empty!");
                } else {
                    return input;
                }
            } catch (Exception e) {
                System.err.println("Invalid format! Enter again.");
            }
        }
    }

    public static int checkInputInt(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                String input = sc.nextLine().trim();
                int number = Integer.parseInt(input);
                if (input.isEmpty()) {
                    System.err.println("Input must not empty!");
                } else {
                    if (number >= 0) {
                        return number;
                    }else{
                        
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid format! Enter again.");
            }

        }
    }

    public static String checkInputUpdateString(String msg) {
        System.out.print(msg);
        String input = sc.nextLine().trim();
        return input;

    }

    public static int checkInputUpdateInt(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                String input = sc.nextLine().trim();

                // if string is blank.
                if (input.isEmpty()) {
                    return -1;
                }
                int number = Integer.parseInt(input);
                if (number >= 0) {
                    return number;
                } else {
                    System.out.println("Number must be >= 0. Please enter again.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid format! Please enter again.");
            }
        }
    }

}
