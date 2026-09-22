import java.util.Scanner;

class Task2{
    static void main() {
        Scanner scan = new Scanner(System.in);
        int userMonth;

        System.out.println("What month is your birthday(1-12).");

        if (scan.hasNextInt()){
            userMonth = scan.nextInt();
            if(userMonth >=1 && userMonth <= 12) {
                System.out.println("Your birth month is :" + userMonth + ".");
            }else {
                System.out.println("Enter a whole number between 1 and 12.");
            }
        }else {
            System.out.println("Enter a whole number between 1 and 12.");
        }
    }
}
