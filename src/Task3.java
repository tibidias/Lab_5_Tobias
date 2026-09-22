import java.util.Scanner;

class Task3{
    static void main() {
        Scanner scan = new Scanner(System.in);
        String userInput;

        System.out.println("What political party are you affiliated with (D, R, I).");

        if (scan.hasNextLine()) {
            userInput = scan.nextLine();
            if (userInput.equalsIgnoreCase("D")) {
                System.out.println("You get a Democratic Donkey.");
            } else if (userInput.equalsIgnoreCase("R")) {
                System.out.println("You get a Republican Elephant.");
            } else if (userInput.equalsIgnoreCase("I")) {
                System.out.println("You get an independant person.");
            } else {
                System.out.println("Please input D, R, or I.");
            }
        } else {
            System.out.println("Please input D, R, or I.");
        }
    }
}
