import java.util.Locale;
import java.util.Scanner;

public class UserSelection {
    public static String getUserSelectionOfTheLetter () {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select the first letter of colour(R, Y, O, G):");
            String letter = scanner.nextLine().trim().toUpperCase();
            switch (letter) {
                case "R": return "RED";
                case "Y": return "YELLOW";
                case "O": return "ORANGE";
                case "G": return "GREEN";
                default:
                    System.out.println("Wrong first letter of colour. Try again.");
            }
        }
    }
}
